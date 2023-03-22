package com.drsturgis.cleanArch.controller.eleitor;

import com.drsturgis.cleanArch.usecases.eleitor.NovoEleitorUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/eleitor")
public class NovoEleitorController {

    @Autowired
    private NovoEleitorUseCase novoEleitorUseCase;

    @PostMapping("/novo")
    public void criarEleitor(String nome, String cpf, LocalDate nascimento) {
        System.out.println(nome + " " + cpf + " " + nascimento);

        novoEleitorUseCase.save(new NovoEleitorUseCase.Input(nome, cpf, nascimento));
    }

    public record Request(String nome, String cpf, LocalDate nascimento){}

}
