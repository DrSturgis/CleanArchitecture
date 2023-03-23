package com.drsturgis.cleanArch.data.repository;

import com.drsturgis.cleanArch.data.schema.EleitorSchema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

public interface EleitorRepository extends JpaRepository<EleitorSchema, Long> {

    Optional<EleitorSchema> findByCpf(String cpf);
    boolean existsByCpf(String cpf);
    Optional<EleitorSchema> findByNumTitulo(int numTitulo);
    boolean existsByNumTitulo(int numTitulo);

}
