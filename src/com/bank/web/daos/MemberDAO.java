package com.bank.web.daos;

import com.bank.web.domains.MemberBean;

public interface MemberDAO {
	public void insertDAO(MemberBean param);
	public MemberBean getMember();
	
}
