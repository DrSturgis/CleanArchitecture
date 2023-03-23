package com.drsturgis.cleanArch.data.gateway;

import com.drsturgis.cleanArch.data.repository.EleitorRepository;
import com.drsturgis.cleanArch.data.schema.EleitorSchema;
import com.drsturgis.cleanArch.domain.entity.Eleitor;
import com.drsturgis.cleanArch.domain.gateway.EleitorGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
@Component
public class EleitorDatabaseGateway implements EleitorGateway {
    @Autowired
    private EleitorRepository eleitorRepository;

    @Override
    public void save(Eleitor eleitor) {
        eleitorRepository.save(new EleitorSchema(eleitor.getNome(), eleitor.getCpf(), eleitor.getNascimento(), eleitor.getNumTitulo()));
        //eleitorRepository.save(eleitor);
    }

    @Override
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(eleitorRepository.findAll());
    }

    @Override
    public ResponseEntity<?> findByCpf(String cpf){
        Optional<EleitorSchema> eleitorSchema = eleitorRepository.findByCpf(cpf);

        if(eleitorSchema.isEmpty()){
            return ResponseEntity.badRequest().body("Eleitor não encontrado");
        }else {

            EleitorSchema eleitor = eleitorSchema.get();

            return ResponseEntity.ok(new Eleitor(eleitor.getNome(), eleitor.getCpf(), eleitor.getNascimento(), eleitor.getNumTitulo()));
        }

    }

    @Override
    public boolean existsByCpf(String cpf) {
        return eleitorRepository.existsByCpf(cpf);
    }

    @Override
    public ResponseEntity<?> findByNumTitulo(int numTitulo) {

        if (existsByNumTitulo(numTitulo)){
            Optional<EleitorSchema> eleitorSchema = eleitorRepository.findByNumTitulo(numTitulo);
            EleitorSchema eleitor = eleitorSchema.get();
            return ResponseEntity.ok(new Eleitor(eleitor.getNome(), eleitor.getCpf(), eleitor.getNascimento(), eleitor.getNumTitulo()));
        } else {
            return ResponseEntity.badRequest().body("Eleitor não encontrado.");
        }

    }

    @Override
    public boolean existsByNumTitulo(int numTitulo) {
        return eleitorRepository.existsByNumTitulo(numTitulo);
    }


}
