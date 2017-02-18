package br.hackathon.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.hackathon.projeto.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
