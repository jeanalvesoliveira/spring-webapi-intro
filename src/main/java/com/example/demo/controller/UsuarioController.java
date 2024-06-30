package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Usuario;
import com.example.demo.repository.UsuarioRepository;

/*
 * A principal função de um Controller é ser um direcionador das regras de negócio
 * que estão nas camadas de domínio ou serviço. Não é recomendável colocar regras de negócio nos controllers.
 */
@RestController
/*
 * Para centralizar um prefixo a esta classe e evitar ficar repetindo o "/usuarios"
 * utilizamos a anotação @RequestMapping
 */
@RequestMapping("/usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	
	@GetMapping()
	public List<Usuario> getUsuarios() {
		return usuarioRepository.findAll();
	}
	
	
	// retorno com parâmetro na URI
	@GetMapping("/{login}")
	public Usuario getUsuario(@PathVariable("login") String login) {
		return usuarioRepository.findByLogin(login);
	}
	
	
	@DeleteMapping("/{id}")
	public void deletarUsuario(@PathVariable("id") Long id) {
		usuarioRepository.deleteById(id);
	}
	
	
	/*
	 * Precisamos garantir que teremos a capacidade de converter a estrutura para um objeto
	 * para isso, utilizamos a anotação RequestBody. Com isso o Spring entenderá que deverá
	 * converter o JSON para o objeto que definimos.
	 */	 
	@PostMapping()
	public void postUsuario(@RequestBody Usuario usuario) {
		usuarioRepository.save(usuario);
	}
	
	
	@PutMapping()
	public void putUsuario(@RequestBody Usuario usuario) {
		usuarioRepository.save(usuario);
	}
	
}
