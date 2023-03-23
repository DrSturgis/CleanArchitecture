package com.drsturgis.cleanArch.controller.eleitor;

import com.drsturgis.cleanArch.usecases.eleitor.ListaEleitorUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eleitor")
public class ListaEleitorController {
    @Autowired
    private ListaEleitorUseCase listaEleitorUseCase;

    @GetMapping("/listar")
    public ResponseEntity<?> listaEleitores(){
        return listaEleitorUseCase.listAll();
    }
}
