package com.drsturgis.cleanArch.controller.candidato;

import com.drsturgis.cleanArch.usecases.candidato.NovoCandidatoUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/candidato")
public class NovoCandidatoController {

    @Autowired
    private NovoCandidatoUseCase novoCandidatoUseCase;

    @PostMapping("/novo")
    public void criaCandidato(Input input){
        novoCandidatoUseCase.save(new NovoCandidatoUseCase.Input(input.nome(), input.cpf(), input.nascimento(), input.partido(), input.numVoto()));
    }

    private record Input(String nome, String cpf, LocalDate nascimento, String partido, int numVoto){}

}
