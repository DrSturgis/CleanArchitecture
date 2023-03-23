package com.drsturgis.cleanArch.domain.entity;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Random;

public class Eleitor extends Pessoa{

    private int numTitulo;

    public Eleitor(String nome, String cpf, LocalDate nascimento) {
        super(nome, cpf, nascimento);
        Random random = new Random();
        int randomNumber = random.nextInt(1000000000);
        this.numTitulo = gerarNumTitulo();
    }

    public Eleitor(String nome, String cpf, LocalDate nascimento, int numTitulo) {
        super(nome, cpf, nascimento);
        this.numTitulo = numTitulo;
    }

    Eleitor(){}

    public int gerarNumTitulo(){
        Random random = new Random();
        int randomNumber = random.nextInt(1000000000);
        return randomNumber;
    }

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
