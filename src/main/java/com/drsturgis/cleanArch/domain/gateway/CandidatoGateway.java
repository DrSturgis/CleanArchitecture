package com.drsturgis.cleanArch.domain.gateway;

import com.drsturgis.cleanArch.domain.entity.Candidato;
import com.drsturgis.cleanArch.domain.valueobjects.Cpf;

import java.util.List;
import java.util.Optional;

public interface CandidatoGateway {

    void save(Candidato candidato);
    void update(Candidato candidato);
    Optional<Candidato> findById(Long id);
    Optional<Candidato> findByCpf(Cpf cpf);
    void deleteById(Long id);
    void deleteByCpf(Cpf cpf);
    List<Candidato> findAll();
    Optional<Candidato> findByNome(String nome);
}
