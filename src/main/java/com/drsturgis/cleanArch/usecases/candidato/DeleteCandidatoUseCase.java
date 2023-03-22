package com.drsturgis.cleanArch.usecases.candidato;

import com.drsturgis.cleanArch.domain.gateway.CandidatoGateway;
import com.drsturgis.cleanArch.domain.valueobjects.Cpf;

public class DeleteCandidatoUseCase {

    private final CandidatoGateway candidatoGateway;

    public DeleteCandidatoUseCase(CandidatoGateway candidatoGateway) {
        this.candidatoGateway = candidatoGateway;
    }

    public void deleteByCpf(Input input){
        candidatoGateway.deleteByCpf(input.cpf());
    }
    public record Input(Cpf cpf){}
    //public record Input(Long id, Cpf cpf){}

}
