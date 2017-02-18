package br.hackathon.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.hackathon.projeto.model.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Integer> {

}
