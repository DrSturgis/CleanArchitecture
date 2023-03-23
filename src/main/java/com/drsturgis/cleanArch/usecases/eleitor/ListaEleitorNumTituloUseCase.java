package com.drsturgis.cleanArch.usecases.eleitor;

import com.drsturgis.cleanArch.domain.gateway.EleitorGateway;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class ListaEleitorNumTituloUseCase {

    private EleitorGateway eleitorGateway;

    public ListaEleitorNumTituloUseCase(EleitorGateway eleitorGateway) {
        this.eleitorGateway = eleitorGateway;
    }

    public ResponseEntity<?> listaEleitorNumTitulo(Input input) {
        return eleitorGateway.findByNumTitulo(input.numTitulo());
    }
    public record Input(int numTitulo){}
}
