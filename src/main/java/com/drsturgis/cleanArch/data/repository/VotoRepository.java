package com.drsturgis.cleanArch.data.repository;

import com.drsturgis.cleanArch.data.schema.VotoSchema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VotoRepository extends JpaRepository<VotoSchema, Long> {
}
