package com.example.demo.handler;

public class CampoObrigatorioException extends BusinessException{

	public CampoObrigatorioException(String campo) {
		super("O campo " + campo + " é obrigatório");
	}

	
}
