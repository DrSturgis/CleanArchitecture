package com.drsturgis.cleanArch.usecases.eleitor;

import com.drsturgis.cleanArch.domain.entity.Eleitor;
import com.drsturgis.cleanArch.domain.gateway.EleitorGateway;
import com.drsturgis.cleanArch.domain.valueobjects.Cpf;

import java.time.LocalDate;

public class NovoEleitorUseCase {

    private EleitorGateway eleitorGateway;

    public NovoEleitorUseCase(EleitorGateway eleitorGateway) {
        this.eleitorGateway = eleitorGateway;
    }

    public void save(Input input){
        Eleitor eleitor = new Eleitor(input.nome(), input.cpf(), input.nascimento(), input.numTitulo());
        eleitorGateway.save(eleitor);
    }


    public record Input(String nome, Cpf cpf, LocalDate nascimento, int numTitulo){}
}
