package com.drsturgis.cleanArch.domain.entity;

import java.time.LocalDate;

public abstract class Pessoa {

    private Long id;
    private String nome;
    private String cpf;
    private LocalDate nascimento;

    public Pessoa(String nome, String cpf, LocalDate nascimento) {
    }

    Pessoa(){}

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf=" + cpf +
                ", nascimento=" + nascimento +
                '}';
    }
}
