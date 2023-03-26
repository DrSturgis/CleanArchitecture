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
    public void update(Candidato candidato) {

    }

    @Override
    public ResponseEntity<?> findByNumeroVoto(int numeroVoto) {

        if (candidatoRepository.existsByNumeroVoto(numeroVoto)){
            return ResponseEntity.ok(candidatoRepository.findByNumeroVoto(numeroVoto));
        } else{
            return ResponseEntity.badRequest().body("Candidato não encontrado");
        }
    }

    @Override
    public Optional<Candidato> findByCpf(String cpf) {
        return Optional.empty();
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void deleteByCpf(String cpf) {

    }

    @Override
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(candidatoRepository.findAll());
    }

    @Override
    public Optional<Candidato> findByNome(String nome) {
        return Optional.empty();
    }

    @Override
    public boolean existsByNumVoto(int numeroVoto) {
        return candidatoRepository.existsByNumeroVoto(numeroVoto);
    }
}
