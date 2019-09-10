package com.bank.web.commands;

import javax.servlet.http.HttpServletRequest;

import com.bank.web.domains.MemberBean;
import com.bank.web.serviceimpls.MemberServiceImpl;
import com.bank.web.services.MemberService;

public class LoginCommand extends MoveCommand{
	public LoginCommand(HttpServletRequest request) throws Exception{
		super(request);
	}
	
	public void execute() {
		MemberBean param = new MemberBean();
		MemberService service = new MemberServiceImpl();
		param.setId(request.getParameter("id"));
		param.setPass(request.getParameter("pass"));
		String domain = "", page = "";
		MemberBean temp = service.login(param);
		if (temp ==null) {
			page = "login";
			domain = "member";
		}else {
			page = "mypage";
			domain = "member";
		}
		Receiver.cmd.setPage(page);
		Receiver.cmd.setDomain(domain);
		Receiver.cmd.setView(domain, page);
		request.setAttribute("member", temp);
		
	}
}
