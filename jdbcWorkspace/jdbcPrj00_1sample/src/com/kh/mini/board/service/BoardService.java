package com.kh.mini.board.service;

import java.sql.Connection;
import java.util.List;

import com.kh.jdbc.JDBCTemplate;
import com.kh.mini.board.dao.BoardDao;
import com.kh.mini.board.vo.BoardVo;

public class BoardService {

	// 필드
	private final BoardDao dao;

	// 기본 생성자
	public BoardService() {
		dao = new BoardDao();
	}

	// 게시글 작성
	public int write(BoardVo vo) throws Exception {

		// conn
		Connection conn = JDBCTemplate.getConnection();

		// DAO
		int result = dao.write(conn, vo);

		// tx
		if (result == 1) {
			JDBCTemplate.commit(conn);
		} else {
			JDBCTemplate.rollback(conn);
		}

		// close
		JDBCTemplate.close(conn);

		return result;
	}

	// 게시글 목록 (최신순)
	public List<BoardVo> boardList() throws Exception {

		// conn
		Connection conn = JDBCTemplate.getConnection();

		// DAO
		List<BoardVo> result = dao.List(conn);

		// close
		JDBCTemplate.close(conn);

		return result;
	}

	public BoardVo boardDetailDyNo(String num) throws Exception {

		// conn
		Connection conn = JDBCTemplate.getConnection();

		// DAO
		BoardVo vo = dao.boardDetailDyNo(conn, num);

		// tx

		// close
		JDBCTemplate.close(conn);

		return vo;
	}

}
