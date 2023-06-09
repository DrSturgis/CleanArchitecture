package com.drsturgis.cleanArch.usecases.eleitor;

import com.drsturgis.cleanArch.data.schema.EleitorSchema;
import com.drsturgis.cleanArch.domain.entity.Eleitor;
import com.drsturgis.cleanArch.domain.gateway.EleitorGateway;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ListaEleitorUseCase {

    private EleitorGateway eleitorGateway;

    public ListaEleitorUseCase(EleitorGateway eleitorGateway) {
        this.eleitorGateway = eleitorGateway;
    }

    public ResponseEntity<?> listAll(){
        return eleitorGateway.findAll();
    }
}
