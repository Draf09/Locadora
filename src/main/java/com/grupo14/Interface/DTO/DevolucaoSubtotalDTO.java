package com.grupo14.Interface.DTO;

import com.grupo14.Entidades.Dominio.Carro;

public class DevolucaoSubtotalDTO {

	private Carro carro;
	private int diarias;
	private float valorSeguro;
	private float valorDesconto;
	private float subtotal;
	private float valorPrePago;
	private float totalPagar;


	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	public int getDiarias() {
		return diarias;
	}

	public void setDiarias(int diarias) {
		this.diarias = diarias;
	}

	public float getValorSeguro() {
		return valorSeguro;
	}

	public void setValorSeguro(float valorSeguro) {
		this.valorSeguro = valorSeguro;
	}

	public float getValorDesconto() {
		return valorDesconto;
	}

	public void setValorDesconto(float valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

	public float getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}

	public float getValorPrePago() {
		return valorPrePago;
	}

	public void setValorPrePago(float valorPrePago) {
		this.valorPrePago = valorPrePago;
	}

	public float getTotalPagar() {
		return totalPagar;
	}

	public void setTotalPagar(float totalPagar) {
		this.totalPagar = totalPagar;
	}

}
