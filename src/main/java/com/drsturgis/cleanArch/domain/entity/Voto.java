package com.drsturgis.cleanArch.domain.entity;

public class Voto {

    private Long id;
    private Eleitor eleitor;
    private Candidato candidato;

    public Voto(Eleitor eleitor, Candidato candidato) {
        this.eleitor = eleitor;
        this.candidato = candidato;
    }

    public Long getId() {
        return id;
    }

    public Eleitor getEleitor() {
        return eleitor;
    }

    public void setEleitor(Eleitor eleitor) {
        this.eleitor = eleitor;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    @Override
    public String toString() {
        return "Voto{" +
                "id=" + id +
                ", eleitor=" + eleitor +
                ", candidato=" + candidato +
                '}';
    }
}
