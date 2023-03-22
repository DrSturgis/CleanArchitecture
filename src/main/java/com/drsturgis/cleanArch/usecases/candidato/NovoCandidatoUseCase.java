package com.drsturgis.cleanArch.usecases.candidato;

import com.drsturgis.cleanArch.domain.entity.Candidato;
import com.drsturgis.cleanArch.domain.gateway.CandidatoGateway;

import java.time.LocalDate;

public class NovoCandidatoUseCase {

    private final CandidatoGateway candidatoGateway;

    public NovoCandidatoUseCase(CandidatoGateway candidatoGateway) {
        this.candidatoGateway = candidatoGateway;
    }

    public void save(Input input){
        Candidato candidato = new Candidato(input.nome(), input.cpf(), input.nascimento(), input.partido(), input.numeroVoto());

        candidatoGateway.save(candidato);
    }

    public record Input(String nome, String cpf, LocalDate nascimento, String partido, int numeroVoto){}
}
