package com.drsturgis.cleanArch.domain.entity;

import com.drsturgis.cleanArch.domain.valueobjects.Cpf;

import java.time.LocalDate;

public class Eleitor extends Pessoa{

    private int numTitulo;

    public Eleitor(String nome, Cpf cpf, LocalDate nascimento, int numTitulo) {
        super(nome, cpf, nascimento);
        this.numTitulo = numTitulo;
    }

    Eleitor(){}

    public int getNumTitulo() {
        return numTitulo;
    }

    public void setNumTitulo(int numTitulo) {
        this.numTitulo = numTitulo;
    }

    @Override
    public String toString() {
        return "Eleitor{" +
                "numTitulo=" + numTitulo +
                "Pessoa{" +
                "nome='" + getNome() + '\'' +
                ", cpf=" + getCpf() +
                ", nascimento=" + getNascimento() +
                "}}";
    }
}
