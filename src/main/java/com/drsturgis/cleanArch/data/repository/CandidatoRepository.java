package com.drsturgis.cleanArch.data.repository;

import com.drsturgis.cleanArch.data.schema.CandidatoSchema;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CandidatoRepository extends JpaRepository<CandidatoSchema, Long> {

    Optional<CandidatoSchema> findByNumeroVoto(int numeroVoto);
    boolean existsByNumeroVoto(int numeroVoto);
}
