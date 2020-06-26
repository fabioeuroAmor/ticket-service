package com.ticket.ticketservice.vos;

import java.io.Serializable;

public class TicketVO implements Serializable{
	
	private Integer idTicket;
	private Integer idProduto;
	private String numeroTicketPremiado;
	private String dcNomeProduto;
	
	public Integer getIdTicket() {
		return idTicket;
	}
	public void setIdTicket(Integer idTicket) {
		this.idTicket = idTicket;
	}
	public Integer getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}
	public String getNumeroTicketPremiado() {
		return numeroTicketPremiado;
	}
	public void setNumeroTicketPremiado(String numeroTicketPremiado) {
		this.numeroTicketPremiado = numeroTicketPremiado;
	}
	public String getDcNomeProduto() {
		return dcNomeProduto;
	}
	public void setDcNomeProduto(String dcNomeProduto) {
		this.dcNomeProduto = dcNomeProduto;
	}
	
	@Override
	public String toString() {
		return "TicketVO [idTicket=" + idTicket + ", idProduto=" + idProduto + ", numeroTicketPremiado="
				+ numeroTicketPremiado + ", dcNomeProduto=" + dcNomeProduto + "]";
	}

}
