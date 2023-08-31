package ticket.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Ticket;
import mvc.command.CommandHandler;
import ticket.service.ReadTicketService;
import ticket.service.TicketNotFoundException;

public class ReadTicketHandler implements CommandHandler {
	private ReadTicketService readService = new ReadTicketService();

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		String tnoVal = req.getParameter("tno"); // 정기권 번호를 파라미터에서 읽어옴
		int tno = Integer.parseInt(tnoVal); // 정기권 번호를 정수로 변환

		try {
			Ticket ticketdata = readService.read(tno); // 정기권 정보를 읽어옴
			req.setAttribute("ticketData", ticketdata); // 결과를 request 속성에 저장
			return "/WEB-INF/readTicket.jsp"; // 정기권 조회 페이지로 이동
		} catch (TicketNotFoundException e) {
			req.getServletContext().log("no ticket", e);
			res.sendError(HttpServletResponse.SC_NOT_FOUND);
			return null;
		}
	}
}
