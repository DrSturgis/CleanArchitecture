package com.drsturgis.cleanArch.controller.eleitor;

import com.drsturgis.cleanArch.usecases.eleitor.ListaEleitorNumTituloUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eleitor")
public class ListaEleitorNumTituloController {
    @Autowired
    private ListaEleitorNumTituloUseCase listaEleitorNumTituloUseCase;

    @PostMapping("/titulo")
    public ResponseEntity<?> listaEleitorNumTitulo(Request input){
        return listaEleitorNumTituloUseCase.listaEleitorNumTitulo(new ListaEleitorNumTituloUseCase.Input(input.numTitulo()));
    }

    private record Request(int numTitulo){}
}
