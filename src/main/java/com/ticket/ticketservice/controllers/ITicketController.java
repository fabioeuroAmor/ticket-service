package com.ticket.ticketservice.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.ticket.ticketservice.dtos.RetornoDTO;
import com.ticket.ticketservice.exception.BDException;



public interface ITicketController {
	
	
	public ResponseEntity<RetornoDTO> cadastraTicket(@RequestParam String idProduto, @RequestParam String numeroPremiado) throws BDException;

}
