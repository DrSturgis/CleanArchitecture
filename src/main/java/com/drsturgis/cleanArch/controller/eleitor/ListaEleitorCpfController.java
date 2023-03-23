package com.drsturgis.cleanArch.controller.eleitor;

import com.drsturgis.cleanArch.usecases.eleitor.ListaEleitorCpfUseCase;
import com.drsturgis.cleanArch.usecases.eleitor.ListaEleitorUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eleitor")
public class ListaEleitorCpfController {
    @Autowired
    private ListaEleitorCpfUseCase listaEleitorCpfUseCase;

    @PostMapping("cpf")
    public ResponseEntity<?> listaEleitorCpf(Request input){
        return listaEleitorCpfUseCase.listaEleitorCpf(new ListaEleitorCpfUseCase.Input(input.cpf()));
    }

    private record Request(String cpf){}
}
