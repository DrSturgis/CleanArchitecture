package com.drsturgis.cleanArch.controller.candidato;

import com.drsturgis.cleanArch.usecases.candidato.ListaCandidatoNumVotoUseCase;
import com.drsturgis.cleanArch.usecases.eleitor.ListaEleitorNumTituloUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/candidato")
public class ListaCandidatoNumVotoController {

    @Autowired
    private ListaCandidatoNumVotoUseCase listaCandidatoNumVotoUseCase;

    @GetMapping("/{numVoto}")
    public ResponseEntity<?> ListaCandidatoNumVoto(@PathVariable("numVoto") int numeroVoto){
        return listaCandidatoNumVotoUseCase.ListaCanditatoNumVoto(new ListaCandidatoNumVotoUseCase.Input(numeroVoto));
    }

    //private record Input(@PathVariable("numVoto") int numeroVoto){}
}
