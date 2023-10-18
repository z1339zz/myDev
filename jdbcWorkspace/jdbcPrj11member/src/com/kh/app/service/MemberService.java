package com.kh.app.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import com.kh.app.dao.MemberDao;
import com.kh.app.jdbc.JDBCTemplate;
import com.kh.app.vo.MemberVo;

public class MemberService {

	private final MemberDao dao;

	public MemberService() {
		dao = new MemberDao();
	}

	public int join(MemberVo vo) throws Exception {

		Connection conn = null;
		// conn
		conn = JDBCTemplate.getConnection();

		// DAO 호출
		int result = dao.join(conn, vo);

		// tx
		if (result == 1) {
			System.out.println("회원가입 성공 ");
			JDBCTemplate.commit(conn);
		} else {
			JDBCTemplate.rollback(conn);
		}

		// close
		JDBCTemplate.close(conn);

		return result;

	}

	public MemberVo login(MemberVo vo) throws Exception {
		
		//conn
		Connection conn = JDBCTemplate.getConnection();
		
		//DAO 호출
		MemberVo dbVo = dao.login(conn , vo);
		
		//tx
		
		//close
		JDBCTemplate.close(conn);
		
		return dbVo;
	}

	public ArrayList<MemberVo> getMemberList() throws Exception {
		
		//conn
		Connection conn = JDBCTemplate.getConnection();
		
		//DAO
		ArrayList<MemberVo> voList = dao.getMemverList(conn);
		
		//tx
		
		//cloes
		JDBCTemplate.close(conn);
		
		
		return voList;
	}

}
