package com.ticket.ticketservice.pojo;

import com.ticket.ticketservice.dtos.TicketDTO;
import com.ticket.ticketservice.vos.TicketVO;

public class TicketPOJO {
	
	private TicketDTO ticketDTO;
	private TicketVO ticketVO;	
	
	public TicketDTO getTicketDTO() {
		return ticketDTO;
	}

	public void setTicketDTO(TicketDTO ticketDTO) {
		this.ticketDTO = ticketDTO;
	}

	public TicketVO getTicketVO() {
		return ticketVO;
	}

	public void setTicketVO(TicketVO ticketVO) {
		this.ticketVO = ticketVO;
	}

	public TicketVO transformeTicketVo(TicketDTO ticketDTO) {
		return null;
		
	}
	
   public TicketDTO transformeTicketDto(TicketVO ticketVO) {
	   TicketDTO ticketDTO = new TicketDTO();
	   
	   ticketDTO.setIdProduto(ticketVO.getIdProduto());
	   ticketDTO.setNumeroTicketPremiado(ticketVO.getNumeroTicketPremiado());
	   return ticketDTO;
		
}

}
