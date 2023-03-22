package com.drsturgis.cleanArch.usecases.eleitor;

import com.drsturgis.cleanArch.domain.entity.Eleitor;
import com.drsturgis.cleanArch.domain.gateway.EleitorGateway;

import java.util.List;

public class ListaEleitorUseCase {

    private EleitorGateway eleitorGateway;

    public ListaEleitorUseCase(EleitorGateway eleitorGateway) {
        this.eleitorGateway = eleitorGateway;
    }

    public List<Eleitor> listAll(){
        return eleitorGateway.findAll();
    }
}
