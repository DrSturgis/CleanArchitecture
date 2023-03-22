package com.drsturgis.cleanArch.data.gateway;

import com.drsturgis.cleanArch.data.repository.EleitorRepository;
import com.drsturgis.cleanArch.data.schema.EleitorSchema;
import com.drsturgis.cleanArch.domain.entity.Eleitor;
import com.drsturgis.cleanArch.domain.gateway.EleitorGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
@Component
public class EleitorDatabaseGateway implements EleitorGateway {
    @Autowired
    private EleitorRepository eleitorRepository;

    @Override
    public void save(Eleitor eleitor) {
        eleitorRepository.save(new EleitorSchema(eleitor.getNome(), eleitor.getCpf(), eleitor.getNascimento(), eleitor.getNumTitulo()));
    }

    @Override
    public void update(Eleitor eleitor) {

    }

    @Override
    public List<Eleitor> findAll() {
        return null;
    }

    @Override
    public Optional<Eleitor> findByCpf(String cpf) {
        return Optional.empty();
    }
}
