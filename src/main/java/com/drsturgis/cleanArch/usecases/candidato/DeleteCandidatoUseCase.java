package com.drsturgis.cleanArch.usecases.candidato;

import com.drsturgis.cleanArch.data.schema.CandidatoSchema;
import com.drsturgis.cleanArch.domain.gateway.CandidatoGateway;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DeleteCandidatoUseCase {

    private final CandidatoGateway candidatoGateway;
    private ListaCandidatoNumVotoUseCase listaCandidatoNumVotoUseCase;


    public DeleteCandidatoUseCase(CandidatoGateway candidatoGateway) {
        this.candidatoGateway = candidatoGateway;
    }

    public ResponseEntity<?> deleteByNumeroVoto(Input input){
        if (candidatoGateway.existsByNumVoto(input.numeroVoto())){
            Optional<CandidatoSchema> candidato = candidatoGateway.findByNumeroVoto(input.numeroVoto());
            candidatoGateway.deleteById(candidato.get().getId());
            return ResponseEntity.ok("Candidato removido.");
        }else {
            return ResponseEntity.badRequest().body("Candidato não encontrado.");
        }


    }
    public record Input(int numeroVoto){}
    //public record Input(Long id, Cpf cpf){}

}
