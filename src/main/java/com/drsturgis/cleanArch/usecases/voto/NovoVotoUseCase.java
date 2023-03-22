package com.drsturgis.cleanArch.usecases.voto;

import com.drsturgis.cleanArch.domain.gateway.EleitorGateway;
import com.drsturgis.cleanArch.domain.gateway.VotoGateway;

public class NovoVotoUseCase {

    private VotoGateway votoGateway;
    private EleitorGateway eleitorGateway;

    public NovoVotoUseCase(VotoGateway votoGateway) {
        this.votoGateway = votoGateway;
    }

    public void votar(Input input){
        //Optional lista =
        //Voto voto = new Voto(input.cpf(), input)
    }

    public record Input(String cpf, int numeroVoto){}
}
