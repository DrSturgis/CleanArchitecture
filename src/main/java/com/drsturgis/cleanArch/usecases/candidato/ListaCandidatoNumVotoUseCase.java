package com.drsturgis.cleanArch.usecases.candidato;

import com.drsturgis.cleanArch.domain.gateway.CandidatoGateway;
import org.springframework.http.ResponseEntity;

public class ListaCandidatoNumVotoUseCase {

    private CandidatoGateway candidatoGateway;

    public ListaCandidatoNumVotoUseCase(CandidatoGateway candidatoGateway){
        this.candidatoGateway = candidatoGateway;
    }

    public ResponseEntity<?> ListaCanditatoNumVoto(Input input){
        return candidatoGateway.findByNumeroVoto(input.numeroVoto());
    }

    public record Input(int numeroVoto){}
}
