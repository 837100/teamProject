package ticket.service;

import java.sql.Connection;
import java.sql.SQLException;

import dao.TicketDao;
import jdbc.connection.ConnectionProvider;
import model.Ticket;

public class ReadTicketService {

	private TicketDao ticketDao = new TicketDao();

	public Ticket read(int tno) {
		try (Connection conn = ConnectionProvider.getConnection()) {
			Ticket ticket = ticketDao.selectById(conn, tno);
			if (ticket == null) {
				throw new TicketNotFoundException();
			}

			conn.commit();
			return ticket;

		} catch (TicketNotFoundException e) {
			throw new RuntimeException(e);
		}

		catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	


}
