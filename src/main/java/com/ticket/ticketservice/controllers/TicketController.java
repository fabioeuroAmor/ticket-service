package com.ticket.ticketservice.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ticket.ticketservice.bos.TicketBO;
import com.ticket.ticketservice.dtos.RetornoVO;
import com.ticket.ticketservice.exception.BDException;
import com.ticket.ticketservice.exception.NegocioException;
import com.ticket.ticketservice.vos.TicketVO;

@RestController
@RequestMapping("/api/ticket/v1")
public class TicketController implements ITicketController {

	@Override
	@RequestMapping(value = "/cadastro", method =  RequestMethod.POST)
	public ResponseEntity<RetornoVO> cadastraTicket(@RequestParam String idProduto, @RequestParam String numeroPremiado) throws BDException {
		RetornoVO retornoVO = new RetornoVO();
		TicketVO ticketVO = new TicketVO();
		try {
			
			ticketVO.setIdProduto( new Integer(idProduto));
			ticketVO.setNumeroTicketPremiado(numeroPremiado);
			
			TicketBO.getInstance().insertTicket(ticketVO);
			retornoVO.setMensagensRetorno("Cadastro realizado com sucesso!!!");
		}catch (NegocioException e) {
			retornoVO.setMensagensRetorno(e.getMessage());
		}
		
		return ResponseEntity.ok(retornoVO);
	}

}
