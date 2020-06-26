package com.ticket.ticketservice.daos;


import com.ticket.ticketservice.dtos.TicketDTO;
import com.ticket.ticketservice.exception.BDException;

public interface ITicketDAO {
	
	public static final String INSERT_TICKET = "INSERT INTO TBL_TICKET" +
			   " (numero_ticket_premiado, id_produto) " +
			   " values (?,?)";
	
	public void insertTicket(TicketDTO ticketDTO) throws BDException;

}
