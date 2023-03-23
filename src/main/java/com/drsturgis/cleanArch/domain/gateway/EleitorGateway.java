package com.drsturgis.cleanArch.domain.gateway;

import com.drsturgis.cleanArch.domain.entity.Eleitor;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface EleitorGateway {
    void save(Eleitor eleitor);
    ResponseEntity<?> findAll();
    ResponseEntity<?> findByCpf(String cpf);
    boolean existsByCpf(String cpf);
    ResponseEntity<?> findByNumTitulo(int numTitulo);
    boolean existsByNumTitulo(int numTitulo);

}
