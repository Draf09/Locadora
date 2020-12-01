package com.grupo14.Entidades.Dominio;

import java.util.Date;

public class Locacao {

	private Carro carro;
	private Date inicio;
	private Date fim;

	public Locacao(Carro carro, Date inicio, Date fim) {
		this.carro = carro;
		this.inicio = inicio;
		this.fim = fim;
	}


	public boolean devolvido() {
		return false;
	}

	public Date dataDevolucao() {
		return fim;
	}

	 


	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	public Date getInicio() {
		return inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public int getFim() {
		return fim;
	}

	public void setFim(int fim) {
		this.fim = fim;
	}
}
