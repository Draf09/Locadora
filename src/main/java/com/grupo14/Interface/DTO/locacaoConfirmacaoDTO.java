package com.grupo14.Interface.DTO;
import java.util.Date;

public class locacaoConfirmacaoDTO {

	private int codigo;
	private boolean confirmedo;
	private float valorSeguro;
	private float valorDesconto;
	private float subtotal;
	private float valorPrePago;
	private float totalPagar;
	private Date dataDevolucao;

	public locacaoConfirmacaoDTO(int codigo, boolean confirmedo, float valorSeguro, float valorDesconto, float subtotal,
			float valorPrePago, float totalPagar, Date dataDevolucao) {
		this.codigo = codigo;
		this.confirmedo = confirmedo;
		this.valorSeguro = valorSeguro;
		this.valorDesconto = valorDesconto;
		this.subtotal = subtotal;
		this.valorPrePago = valorPrePago;
		this.totalPagar = totalPagar;
		this.dataDevolucao = dataDevolucao;
	}


	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public boolean isConfirmedo() {
		return confirmedo;
	}

	public void setConfirmedo(boolean confirmedo) {
		this.confirmedo = confirmedo;
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

	public Date getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}


}
