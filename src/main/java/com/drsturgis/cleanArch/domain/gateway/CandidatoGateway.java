package com.drsturgis.cleanArch.domain.gateway;

import com.drsturgis.cleanArch.data.schema.CandidatoSchema;
import com.drsturgis.cleanArch.domain.entity.Candidato;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

public interface CandidatoGateway {

    void save(Candidato candidato);
    void update(Candidato candidato);
    ResponseEntity<?> findByNumeroVoto(int numeroVoto);
    Optional<Candidato> findByCpf(String cpf);
    void deleteById(Long id);
    void deleteByCpf(String cpf);
    ResponseEntity<?> findAll();
    Optional<Candidato> findByNome(String nome);
    boolean existsByNumVoto(int numVoto);
}
