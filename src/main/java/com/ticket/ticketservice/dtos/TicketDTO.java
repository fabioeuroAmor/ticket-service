package com.ticket.ticketservice.dtos;

import java.io.Serializable;

public class TicketDTO implements Serializable{
	
	private Integer idTicket;
	private Integer idProduto;
	private String numeroTicketPremiado;
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
	
	
	@Override
	public String toString() {
		return "Ticket [idTicket=" + idTicket + ", idProduto=" + idProduto + ", numeroTicketPremiado="
				+ numeroTicketPremiado + "]";
	}	

}
