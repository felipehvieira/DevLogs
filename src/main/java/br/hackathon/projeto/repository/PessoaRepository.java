package br.hackathon.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.hackathon.projeto.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}
