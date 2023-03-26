package com.drsturgis.cleanArch.controller.candidato;

import com.drsturgis.cleanArch.usecases.candidato.ListaCandidatoNumVotoUseCase;
import com.drsturgis.cleanArch.usecases.eleitor.ListaEleitorNumTituloUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/candidato")
public class ListaCandidatoNumVotoController {

    @Autowired
    private ListaCandidatoNumVotoUseCase listaCandidatoNumVotoUseCase;

    @PostMapping("/{numVoto}")
    public ResponseEntity<?> ListaCandidatoNumVoto(Input input){
        return listaCandidatoNumVotoUseCase.ListaCanditatoNumVoto(new ListaCandidatoNumVotoUseCase.Input(input.numeroVoto()));
    }

    private record Input(@PathVariable("numVoto") int numeroVoto){}
}
