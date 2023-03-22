package com.drsturgis.cleanArch.domain.gateway;

import com.drsturgis.cleanArch.domain.entity.Candidato;

import java.util.List;
import java.util.Optional;

public interface CandidatoGateway {

    void save(Candidato candidato);
    void update(Candidato candidato);
    Optional<Candidato> findById(Long id);
    Optional<Candidato> findByCpf(String cpf);
    void deleteById(Long id);
    void deleteByCpf(String cpf);
    List<Candidato> findAll();
    Optional<Candidato> findByNome(String nome);
}
