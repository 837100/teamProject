package ticket.command;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.command.CommandHandler;
import ticket.service.DuplicateIdException;
import ticket.service.RegistRequest;
import ticket.service.WriteTicketService;

public class WriteTicketHandler implements CommandHandler {
    private static final String FORM_VIEW = "/WEB-INF/newTicketForm.jsp";

    @Override
    public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
        if (req.getMethod().equalsIgnoreCase("GET")) {
            return processForm(req, res);
        } else if (req.getMethod().equalsIgnoreCase("POST")) {
            return processForm(req, res);
        } else {
            res.setStatus(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
            return null;
        }
    }

    private String processForm(HttpServletRequest req, HttpServletResponse res) {
        return FORM_VIEW;
    }

    private String processSubmit(HttpServletRequest req, HttpServletResponse res) throws ParseException {
		RegistRequest registReq = new RegistRequest();
		registReq.setTno(req.getParameter("tno"));
		registReq.setCarno(req.getParameter("carno"));
		registReq.setPhone(req.getParameter("phone"));
		registReq.setGrade(req.getParameter("grade"));
		registReq.setTstat(req.getParameter("tstat"));
		registReq.setStartDate(req.getParameter("startDate"));
		registReq.setEndDate(req.getParameter("endDate"));
		
		Map<String, Boolean> errors = new HashMap<String, Boolean>();
		req.setAttribute("errors", errors);
		
		registReq.validate(errors);
		if (!errors.isEmpty()) {
			return FORM_VIEW;
		}
		
		try {
			WriteTicketService.regist(registReq);
			return "/view/readTicketForm.jsp";
		} catch (DuplicateIdException e) {
			errors.put("duplicateId", Boolean.TRUE);
			return FORM_VIEW;
		}
	}
}
   
