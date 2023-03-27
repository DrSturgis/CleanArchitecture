package com.drsturgis.cleanArch.domain.gateway;

import com.drsturgis.cleanArch.data.schema.CandidatoSchema;
import com.drsturgis.cleanArch.domain.entity.Candidato;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

public interface CandidatoGateway {

    void save(Candidato candidato);
    Optional<CandidatoSchema> findByNumeroVoto(int numeroVoto);
    void deleteById(Long id);
    ResponseEntity<?> findAll();
    boolean existsByNumVoto(int numeroVoto);
    boolean existsByCpf(String cpf);
}
