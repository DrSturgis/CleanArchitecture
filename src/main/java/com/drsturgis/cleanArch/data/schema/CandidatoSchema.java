package com.drsturgis.cleanArch.data.schema;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "candidato")
public class CandidatoSchema {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    @Column(nullable = false, columnDefinition = "VARCHAR(11)")
    private String cpf;
    private LocalDate nascimento;
    private String partido;
    private int numeroVoto;


    public CandidatoSchema(String nome, String cpf, LocalDate nascimento, String partido, int numeroVoto) {
        this.nome = nome;
        this.cpf = cpf.toString();
        this.nascimento = nascimento;
        this.partido = partido;
        this.numeroVoto = numeroVoto;
    }

    public CandidatoSchema() {
    }

    public Long getId() {
        return id;
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

    public String getPartido() {
        return partido;
    }

    public int getNumeroVoto() {
        return numeroVoto;
    }
}
