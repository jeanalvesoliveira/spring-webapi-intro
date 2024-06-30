package com.example.demo.model;

import java.util.Objects;

public class Usuario {

	private Long id;
	private String login;
	private String senha;
	private String email;
	
	
	// Construtores
	public Usuario(String login, String senha, String email) {
		super();
		this.login = login;
		this.senha = senha;
		this.email = email;
	}
	
	public Usuario() {}

	
	// Getters e Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	// ToString
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", login=" + login + ", senha=" + senha + ", email=" + email + "]";
	}

	
	// HashCode e Equals
	@Override
	public int hashCode() {
		return Objects.hash(email, id, login, senha);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(email, other.email) && Objects.equals(id, other.id) && Objects.equals(login, other.login)
				&& Objects.equals(senha, other.senha);
	}
		
}
