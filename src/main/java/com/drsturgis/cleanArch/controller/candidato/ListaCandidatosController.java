package com.drsturgis.cleanArch.controller.candidato;

import com.drsturgis.cleanArch.domain.entity.Candidato;
import com.drsturgis.cleanArch.usecases.candidato.ListaCandidatosUseCase;
import com.drsturgis.cleanArch.usecases.eleitor.ListaEleitorCpfUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/candidato")
public class ListaCandidatosController {

    @Autowired
    private ListaCandidatosUseCase listaCandidatosUseCase;

    @GetMapping("/lista")
    public ResponseEntity<?> listaCandidatos(){
        return listaCandidatosUseCase.findAll();
    }
}
