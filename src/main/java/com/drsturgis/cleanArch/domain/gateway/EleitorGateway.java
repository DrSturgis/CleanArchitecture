package com.drsturgis.cleanArch.domain.gateway;

import com.drsturgis.cleanArch.domain.entity.Eleitor;

import java.util.List;
import java.util.Optional;

public interface EleitorGateway {
    void save(Eleitor eleitor);
    void update(Eleitor eleitor);
    List<Eleitor> findAll();
    Optional<Eleitor> findByCpf(String cpf);
}
