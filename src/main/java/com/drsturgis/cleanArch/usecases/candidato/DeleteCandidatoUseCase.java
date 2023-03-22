package com.drsturgis.cleanArch.usecases.candidato;

import com.drsturgis.cleanArch.domain.gateway.CandidatoGateway;

public class DeleteCandidatoUseCase {

    private final CandidatoGateway candidatoGateway;

    public DeleteCandidatoUseCase(CandidatoGateway candidatoGateway) {
        this.candidatoGateway = candidatoGateway;
    }

    public void deleteByCpf(Input input){
        candidatoGateway.deleteByCpf(input.cpf());
    }
    public record Input(String cpf){}
    //public record Input(Long id, Cpf cpf){}

}
