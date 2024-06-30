package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// para esta classe ser um componente com suporte a requisições HTTP com base na arquitetura REST
@RestController
public class BemVindoController {
	
	@GetMapping
	public String bemVindo() {
		return "Bem-vindo ao Spring Web!";
	}

}
