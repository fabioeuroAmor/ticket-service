package com.ticket.ticketservice.bos;

import com.ticket.ticketservice.dtos.TicketDTO;
import com.ticket.ticketservice.exception.BDException;
import com.ticket.ticketservice.vos.TicketVO;

public interface ITicketBO {
	
	public void insertTicket(TicketVO ticketVO) throws BDException;

}
