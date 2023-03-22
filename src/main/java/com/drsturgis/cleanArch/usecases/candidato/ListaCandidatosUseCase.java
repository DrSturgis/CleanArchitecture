package com.drsturgis.cleanArch.usecases.candidato;

import com.drsturgis.cleanArch.domain.entity.Candidato;
import com.drsturgis.cleanArch.domain.gateway.CandidatoGateway;

import java.util.List;

public class ListaCandidatosUseCase {

    private final CandidatoGateway candidatoGateway;

    public ListaCandidatosUseCase(CandidatoGateway candidatoGateway) {
        this.candidatoGateway = candidatoGateway;
    }

    public List<Candidato> findAll(){
        return candidatoGateway.findAll();
    }
}
