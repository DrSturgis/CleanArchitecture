package com.drsturgis.cleanArch.data.repository;

import com.drsturgis.cleanArch.data.schema.EleitorSchema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EleitorRepository extends JpaRepository<EleitorSchema, Long> {

}
