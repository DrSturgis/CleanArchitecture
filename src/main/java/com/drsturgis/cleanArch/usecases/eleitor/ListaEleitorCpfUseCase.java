package com.drsturgis.cleanArch.usecases.eleitor;

import com.drsturgis.cleanArch.domain.gateway.EleitorGateway;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ListaEleitorCpfUseCase {

    private EleitorGateway eleitorGateway;

    public ListaEleitorCpfUseCase(EleitorGateway eleitorGateway) {
        this.eleitorGateway = eleitorGateway;
    }


    public ResponseEntity<?> listaEleitorCpf(Input input){
        return eleitorGateway.findByCpf(input.cpf());
    }

    public record Input(String cpf){}
}
