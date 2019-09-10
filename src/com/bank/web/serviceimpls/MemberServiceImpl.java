package com.bank.web.serviceimpls;

import com.bank.web.daoimps.MemberDAOImpl;
import com.bank.web.daos.MemberDAO;
import com.bank.web.domains.MemberBean;
import com.bank.web.services.MemberService;

public class MemberServiceImpl implements MemberService{
	public MemberDAO dao;
	public MemberServiceImpl() {
		dao = new MemberDAOImpl();
	}
	@Override
	public void join(MemberBean param) {
		
		dao.insertDAO(param);
		
	}

	@Override
	public MemberBean login(MemberBean param) {
		MemberBean temp = dao.getMember();
		if(!(param.getId().equals(temp.getId())&&param.getPass().equals(temp.getPass()))) {
			temp=null;
		}
		return temp;
	}

}
