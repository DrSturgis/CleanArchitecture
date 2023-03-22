package com.drsturgis.cleanArch.usecases.eleitor;

import com.drsturgis.cleanArch.domain.entity.Eleitor;
import com.drsturgis.cleanArch.domain.gateway.EleitorGateway;

import java.util.Optional;

public class ListaEleitorCpfUseCase {

    private EleitorGateway eleitorGateway;

    public ListaEleitorCpfUseCase(EleitorGateway eleitorGateway) {
        this.eleitorGateway = eleitorGateway;
    }


    public Optional<Eleitor> listaEleitorCpf(Input input){
        return eleitorGateway.findByCpf(input.cpf());
    }

    public record Input(String cpf){}
}
