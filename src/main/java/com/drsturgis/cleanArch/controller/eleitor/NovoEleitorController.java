package com.drsturgis.cleanArch.controller.eleitor;

import com.drsturgis.cleanArch.usecases.eleitor.NovoEleitorUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/eleitor")
public class NovoEleitorController {

    @Autowired
    private NovoEleitorUseCase novoEleitorUseCase;

    @PostMapping("/novo")
    public ResponseEntity<?> criarEleitor(String nome, String cpf, LocalDate nascimento) {
        return novoEleitorUseCase.save(new NovoEleitorUseCase.Input(nome, cpf, nascimento));
    }

    private record Request(String nome, String cpf, LocalDate nascimento){}

}
