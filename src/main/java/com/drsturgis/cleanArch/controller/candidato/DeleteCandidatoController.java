package com.drsturgis.cleanArch.controller.candidato;

import com.drsturgis.cleanArch.usecases.candidato.DeleteCandidatoUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/candidato")
public class DeleteCandidatoController {

    @Autowired
    private DeleteCandidatoUseCase deleteCandidatoUseCase;

    @DeleteMapping("/delete/{numVoto}")
    public ResponseEntity<?> DeleteCandidatoNumVoto(@PathVariable("numVoto") int numVoto){
        return deleteCandidatoUseCase.deleteByNumeroVoto(new DeleteCandidatoUseCase.Input(numVoto));

    }


}
