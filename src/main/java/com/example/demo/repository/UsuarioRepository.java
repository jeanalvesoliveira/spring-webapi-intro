package com.example.demo.repository;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Usuario;

@Repository
public class UsuarioRepository {

	public void save(Usuario usuario) {
		if (usuario.getId() == null) {
			System.out.println("SAVE - Recebendo o usuário na camada de repositório");
		} else {
			System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
		}
		System.out.println(usuario);
	}
	
	
	public void deleteById(Long id) {
		System.out.println("DELETE - Recebendo o id " + id + " para excluir um usuário");
		System.out.println(id);
	}
	
	
	public List<Usuario> findAll() {
		System.out.println("LIST - Listando os usuários do sistema");
		
		List<Usuario> usuarios = new LinkedList<>();
		usuarios.add(new Usuario("jeanalves", "281283", "jeanalvesoliveira@gmail.com"));
		usuarios.add(new Usuario("alessandraoliveira", "230686", "alessandraoliveira@gmail.com"));
		
		return usuarios;
	}
	
	
	public Usuario findById(Long id) {
		System.out.println("FIND - Recebendo o id " + id + " para localizar um usuário");
		
		return new Usuario("jeanalves", "281283", "jeanalvesoliveira@gmail.com");
	}
	
	
	public Usuario findByLogin(String login) {
		System.out.println("FIND - Recebendo o login " + login + " para localizar um usuário");
		
		return new Usuario("jeanalves", "281283", "jeanalvesoliveira@gmail.com");
	}
	
	
}
