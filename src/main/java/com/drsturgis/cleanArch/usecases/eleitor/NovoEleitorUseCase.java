package com.drsturgis.cleanArch.usecases.eleitor;

import com.drsturgis.cleanArch.domain.entity.Eleitor;
import com.drsturgis.cleanArch.domain.gateway.EleitorGateway;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
@Service
public class NovoEleitorUseCase {

    private EleitorGateway eleitorGateway;

    public NovoEleitorUseCase(EleitorGateway eleitorGateway) {
        this.eleitorGateway = eleitorGateway;
    }

    public void save(Input input){
        Eleitor eleitor = new Eleitor(input.nome(), input.cpf(), input.nascimento());
        eleitorGateway.save(eleitor);
    }


    public record Input(String nome, String cpf, LocalDate nascimento){}
}
