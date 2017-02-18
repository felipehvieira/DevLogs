package br.hackathon.projeto.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Evento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String titulo_evento;
	@ManyToOne
	@JoinColumn(name = "usuario_fk")
	private Usuario usuario;
	@ManyToOne
	@JoinColumn(name = "empresa_fk")
	private Empresa empresa;

	public Evento() {

	}

	public Evento(int id, String titulo_evento, Usuario usuario, Empresa empresa) {
		super();
		this.id = id;
		this.titulo_evento = titulo_evento;
		this.usuario = usuario;
		this.empresa = empresa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo_evento() {
		return titulo_evento;
	}

	public void setTitulo_evento(String titulo_evento) {
		this.titulo_evento = titulo_evento;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

}
