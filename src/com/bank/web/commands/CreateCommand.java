package com.bank.web.commands;

import javax.servlet.http.HttpServletRequest;

import com.bank.web.domains.MemberBean;
import com.bank.web.serviceimpls.MemberServiceImpl;
import com.bank.web.services.MemberService;

public class CreateCommand extends MoveCommand{
	public CreateCommand(HttpServletRequest request) throws Exception {
		super(request);
	}
	public void execute() {
		super.execute();
		MemberBean param = new MemberBean();
		MemberService service = new MemberServiceImpl();
		param.setCredit(request.getParameter("credit"));
		param.setId(request.getParameter("id"));
		param.setName(request.getParameter("name"));
		param.setPass(request.getParameter("pass"));
		param.setSsn(request.getParameter("ssn"));
		service.join(param);
		Receiver.cmd.setPage("login");
	}
}
