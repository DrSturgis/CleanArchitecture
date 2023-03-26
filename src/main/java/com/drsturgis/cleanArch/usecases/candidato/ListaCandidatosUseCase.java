package com.drsturgis.cleanArch.usecases.candidato;

import com.drsturgis.cleanArch.domain.entity.Candidato;
import com.drsturgis.cleanArch.domain.gateway.CandidatoGateway;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListaCandidatosUseCase {

    private final CandidatoGateway candidatoGateway;

    public ListaCandidatosUseCase(CandidatoGateway candidatoGateway) {
        this.candidatoGateway = candidatoGateway;
    }

    public ResponseEntity<?> findAll(){
        return candidatoGateway.findAll();
    }
}
