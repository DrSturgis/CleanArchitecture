package com.drsturgis.cleanArch.usecases.eleitor;

import com.drsturgis.cleanArch.domain.entity.Eleitor;
import com.drsturgis.cleanArch.domain.gateway.EleitorGateway;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class NovoEleitorUseCase {

    private EleitorGateway eleitorGateway;

    public NovoEleitorUseCase(EleitorGateway eleitorGateway) {
        this.eleitorGateway = eleitorGateway;
    }

    public ResponseEntity<?> save(Input input){
        System.out.println(input.cpf());
        if(!eleitorGateway.existsByCpf(input.cpf())){
            Eleitor eleitor = new Eleitor(input.nome(), input.cpf(), input.nascimento());
            System.out.println(eleitor);
            while (eleitorGateway.existsByNumTitulo(eleitor.getNumTitulo())){
                eleitor.setNumTitulo(eleitor.gerarNumTitulo());
            }
            eleitorGateway.save(eleitor);
            return ResponseEntity.ok(eleitorGateway.findByCpf(input.cpf()).toString());
        } else {
            return ResponseEntity.badRequest().body("Eleitor já existente.");
        }


    }

    public record Input(String nome, String cpf, LocalDate nascimento){}
}
