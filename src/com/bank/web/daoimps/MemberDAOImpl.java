package com.bank.web.daoimps;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.Buffer;

import com.bank.web.daos.MemberDAO;
import com.bank.web.domains.MemberBean;
import com.bank.web.pool.Constants;
import com.sun.corba.se.impl.orbutil.closure.Constant;

import jdk.jfr.events.FileWriteEvent;

public class MemberDAOImpl implements MemberDAO{
	File file = new File(Constants.FLIE_PATH+"member.txt");
	@Override
	public void insertDAO(MemberBean param) {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			writer.write(String.format("%s,%s,%s,%s,%s",param.getId(),param.getPass(),param.getName(),param.getSsn(),param.getCredit()));
			writer.flush();
			writer.close();
		} catch (Exception e) {
		 e.printStackTrace();
		}
		
	}

	@Override
	public MemberBean getMember() {
		MemberBean cb = new MemberBean();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String[] arr = reader.readLine().split(",");
			cb.setCredit(arr[4]);
			cb.setId(arr[0]);
			cb.setName(arr[2]);
			cb.setPass(arr[1]);
			cb.setSsn(arr[3]);
			reader.close();
		} catch (Exception e) {
		 e.printStackTrace();
		}
		return cb;
	}

}
