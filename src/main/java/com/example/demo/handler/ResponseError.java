package com.example.demo.handler;

import java.time.LocalDate;

public class ResponseError {
	// Atributos
	private LocalDate timestamp = LocalDate.now(); 
	private String status = "erro";
	private int statusCode = 400;
	private String mensagemErro;
	
	
	// Getters e Setters
	public LocalDate getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDate timestamp) {
		this.timestamp = timestamp;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMensagemErro() {
		return mensagemErro;
	}
	public void setMensagemErro(String mensagemErro) {
		this.mensagemErro = mensagemErro;
	}
		
}
