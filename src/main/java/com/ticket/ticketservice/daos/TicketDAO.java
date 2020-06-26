package com.ticket.ticketservice.daos;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import com.ticket.ticketservice.dtos.TicketDTO;
import com.ticket.ticketservice.exception.BDException;

public class TicketDAO extends PersistenceManagerDAO implements ITicketDAO {
	
private static TicketDAO instance;
	
	public static TicketDAO getInstance() {
		if (instance == null) {
			instance = new TicketDAO();
		}
		return instance;
	}
	
	 private static int quantPautaInseridos = 0;
     private static int quantMaximaPautaCache = 100;

	@Override
	public void insertTicket(TicketDTO ticketDTO) throws BDException {
		Connection conn = null;
		 PreparedStatement stmt = null;	
		 
		 try {
			 
			 conn = PersistenceManagerDAO.getConnection();
			 stmt = conn.prepareStatement(INSERT_TICKET);
			 
			 stmt.setString(1, ticketDTO.getNumeroTicketPremiado());
			 stmt.setInt(2, ticketDTO.getIdProduto());
			 
			 stmt.executeUpdate();			
				//conn.commit();
				
				//Gerenciamento de commit ao banco
//				quantPautaInseridos++;
//				if (quantPautaInseridos == quantMaximaPautaCache) {
//					conn.commit();
//					quantPautaInseridos = 0;
//					System.out.println("Bloco de ["+quantMaximaPautaCache+"] inseridas");
//				}
			 
		 }catch (SQLException e) {
				throw new BDException(e.getMessage());
		 } catch (Exception e) {			
				e.printStackTrace();
		 }finally {
			PersistenceManagerDAO.closeStatement(stmt);
			PersistenceManagerDAO.closeConnection(conn);
		}	
		
	}

}
