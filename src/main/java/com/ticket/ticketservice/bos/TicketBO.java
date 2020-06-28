package com.ticket.ticketservice.bos;

import com.ticket.ticketservice.daos.TicketDAO;
import com.ticket.ticketservice.dtos.TicketDTO;
import com.ticket.ticketservice.exception.BDException;
import com.ticket.ticketservice.pojo.TicketPOJO;
import com.ticket.ticketservice.vos.TicketVO;

public class TicketBO implements ITicketBO{
	
	   private static TicketBO instance;
		
		public static TicketBO getInstance() {
			if (instance == null) {
				instance = new TicketBO();
			}
			return instance;
		}
		
	public static final String MN_ERRO_TICKET_JA_CADASTRADA ="Este ticket já esta cadastrada!!!";

	@Override
	public void insertTicket(TicketVO ticketVO) throws BDException {
		
		try {
			TicketPOJO  ticketPOJO = new TicketPOJO();
			TicketDTO  ticketDTO = new TicketDTO();
			ticketDTO = ticketPOJO.transformeTicketDto(ticketVO);
			
			TicketDAO.getInstance().insertTicket(ticketDTO);
		} catch (Exception e) {
			throw new BDException(e.getMessage());
		}	
		
	}

}
