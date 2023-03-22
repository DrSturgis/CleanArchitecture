package com.drsturgis.cleanArch.data.repository;

import com.drsturgis.cleanArch.data.schema.CandidatoSchema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidatoRepository extends JpaRepository<CandidatoSchema, Long> {
}
