package com.drsturgis.cleanArch.usecases.candidato;

import com.drsturgis.cleanArch.domain.gateway.CandidatoGateway;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ListaCandidatoNumVotoUseCase {

    private final CandidatoGateway candidatoGateway;

    public ListaCandidatoNumVotoUseCase(CandidatoGateway candidatoGateway){
        this.candidatoGateway = candidatoGateway;
    }

    public ResponseEntity<?> ListaCanditatoNumVoto(Input input){
        if(candidatoGateway.existsByNumVoto(input.numeroVoto())){
            return ResponseEntity.ok(candidatoGateway.findByNumeroVoto(input.numeroVoto()));
        } else {
            return ResponseEntity.badRequest().body("Candidato não encontrado.");
        }

    }

    public record Input(int numeroVoto){}
}
