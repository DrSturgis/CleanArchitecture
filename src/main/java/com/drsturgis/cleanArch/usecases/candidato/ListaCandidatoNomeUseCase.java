package com.drsturgis.cleanArch.usecases.candidato;

import com.drsturgis.cleanArch.domain.entity.Candidato;
import com.drsturgis.cleanArch.domain.gateway.CandidatoGateway;

import java.util.Optional;

public class ListaCandidatoNomeUseCase {

    private final CandidatoGateway candidatoGateway;

    public ListaCandidatoNomeUseCase(CandidatoGateway candidatoGateway) {
        this.candidatoGateway = candidatoGateway;
    }

    public Optional<Candidato> findByNome(Input input){
        return candidatoGateway.findByNome(input.nome());
    }


    public record Input(String nome){}
}
