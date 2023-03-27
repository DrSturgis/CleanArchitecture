package com.drsturgis.cleanArch.usecases.candidato;

import com.drsturgis.cleanArch.domain.entity.Candidato;
import com.drsturgis.cleanArch.domain.gateway.CandidatoGateway;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class NovoCandidatoUseCase {

    private final CandidatoGateway candidatoGateway;

    public NovoCandidatoUseCase(CandidatoGateway candidatoGateway) {
        this.candidatoGateway = candidatoGateway;
    }

    public ResponseEntity<?> save(Input input){
        if (!candidatoGateway.existsByNumVoto(input.numeroVoto()) && !candidatoGateway.existsByCpf(input.cpf())){
            Candidato candidato = new Candidato(input.nome(), input.cpf(), input.nascimento(), input.partido(), input.numeroVoto());
            candidatoGateway.save(candidato);
            return ResponseEntity.ok(candidato);
        } else {
            return ResponseEntity.badRequest().body("Eleitor já existente.");
        }



    }

    public record Input(String nome, String cpf, LocalDate nascimento, String partido, int numeroVoto){}
}
