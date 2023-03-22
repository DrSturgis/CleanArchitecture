package com.drsturgis.cleanArch.domain.gateway;

import com.drsturgis.cleanArch.domain.entity.Eleitor;
import com.drsturgis.cleanArch.domain.valueobjects.Cpf;

import java.util.List;
import java.util.Optional;

public interface EleitorGateway {
    void save(Eleitor eleitor);
    void update(Eleitor eleitor);
    List<Eleitor> findAll();
    Optional<Eleitor> findByCpf(Cpf cpf);
}
