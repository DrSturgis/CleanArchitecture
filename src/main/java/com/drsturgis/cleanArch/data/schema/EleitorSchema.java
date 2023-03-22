package com.drsturgis.cleanArch.data.schema;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
@Entity
@Table(name = "eleitor")
public class EleitorSchema {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    @Column(nullable = false, columnDefinition = "VARCHAR(14)")
    private String cpf;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate nascimento;
    private int numTitulo;

    public EleitorSchema(String nome, String cpf, LocalDate nascimento, int numTitulo) {
        System.out.println(nome + " " + cpf + " " + nascimento);
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.numTitulo = numTitulo;
    }

    public EleitorSchema(){}

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

    public int getNumTitulo() {
        return numTitulo;
    }
}
