package com.drsturgis.cleanArch.data.schema;

import com.drsturgis.cleanArch.domain.entity.Candidato;
import com.drsturgis.cleanArch.domain.entity.Eleitor;
import jakarta.persistence.*;

@Entity
@Table(name = "votos")
public class VotoSchema {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    @PrimaryKeyJoinColumn(referencedColumnName = "eleitor_id")
    private EleitorSchema eleitor;

    @OneToOne
    @PrimaryKeyJoinColumn(referencedColumnName = "candidato_id")
    private CandidatoSchema candidato;

    public VotoSchema(Long id, Eleitor eleitor, Candidato candidato) {
        this.id = id;
        this.eleitor = new EleitorSchema(eleitor.getNome(), eleitor.getCpf(), eleitor.getNascimento(), eleitor.getNumTitulo());
        this.candidato = new CandidatoSchema(candidato.getNome(), candidato.getCpf(), candidato.getNascimento(), candidato.getPartido(), getCandidato().getNumeroVoto());
    }

    public Long getId() {
        return id;
    }

    public EleitorSchema getEleitor() {
        return eleitor;
    }

    public CandidatoSchema getCandidato() {
        return candidato;
    }
}
