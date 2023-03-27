package com.drsturgis.cleanArch.data.gateway;

import com.drsturgis.cleanArch.data.repository.CandidatoRepository;
import com.drsturgis.cleanArch.data.schema.CandidatoSchema;
import com.drsturgis.cleanArch.domain.entity.Candidato;
import com.drsturgis.cleanArch.domain.gateway.CandidatoGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CandidatoDatabaseGateway implements CandidatoGateway {

    @Autowired
    private CandidatoRepository candidatoRepository;

    @Override
    public void save(Candidato candidato) {
        candidatoRepository.save(new CandidatoSchema(candidato.getNome(), candidato.getCpf(), candidato.getNascimento(), candidato.getPartido(), candidato.getNumeroVoto()));
    }

    @Override
    public Optional<CandidatoSchema> findByNumeroVoto(int numeroVoto) {
            return candidatoRepository.findByNumeroVoto(numeroVoto);
    }

    @Override
    public void deleteById(Long id) {
        candidatoRepository.deleteById(id);
    }

    @Override
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(candidatoRepository.findAll());
    }

    @Override
    public boolean existsByNumVoto(int numeroVoto) {
        return candidatoRepository.existsByNumeroVoto(numeroVoto);
    }

    @Override
    public boolean existsByCpf(String cpf) {
        return candidatoRepository.existsByCpf(cpf);
    }
}
