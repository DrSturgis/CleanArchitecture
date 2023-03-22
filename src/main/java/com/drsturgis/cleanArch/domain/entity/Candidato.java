package com.drsturgis.cleanArch.domain.entity;

import com.drsturgis.cleanArch.domain.valueobjects.Cpf;

import java.time.LocalDate;

public class Candidato extends Pessoa{

    private String partido;
    private int numeroVoto;

    public Candidato(String nome, Cpf cpf, LocalDate nascimento, String partido, int numeroVoto) {
        super(nome, cpf, nascimento);
        this.partido = partido;
        this.numeroVoto =  numeroVoto;
    }

    Candidato(){

    }
    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public int getNumeroVoto() {
        return numeroVoto;
    }

    public void setNumeroVoto(int numeroVoto) {
        this.numeroVoto = numeroVoto;
    }

    @Override
    public String toString() {
        return "Candidato{" +
                "partido='" + partido + '\'' +
                ", numeroVoto=" + numeroVoto +
                "Pessoa{" +
                "nome='" + getNome() + '\'' +
                ", cpf=" + getCpf() +
                ", nascimento=" + getNascimento() +
                "}}";
    }
}
