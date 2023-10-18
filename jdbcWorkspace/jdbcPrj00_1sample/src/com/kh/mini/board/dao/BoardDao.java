package com.kh.mini.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.kh.jdbc.JDBCTemplate;
import com.kh.mini.board.vo.BoardVo;
import com.kh.mini.main.Main;

public class BoardDao {

	// 작성하기
	public int write(Connection conn, BoardVo vo) throws Exception {

		// SQL
		String sql = "INSERT INTO BOARD(NO, TITLE, CONTENT, WRITER_NO) VALUES(SEQ_BOARD_NO.NEXTVAL, ?, ?, ?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, vo.getTitle());
		pstmt.setString(2, vo.getContent());
		pstmt.setString(3, Main.loginMemeber.getNo());
		int result = pstmt.executeUpdate();

		// close
		JDBCTemplate.close(pstmt);

		return result;
	}

	// 게시글 목록 (최신순)
	public List<BoardVo> List(Connection conn) throws Exception {

		// SQL
		String sql = "SELECT B.NO , B.TITLE , M.NICK AS WRITER_NICK , B.HIT , TO_CHAR(B.ENROLL_DATE, 'YYYY\"년\"MM\"월\"DD\"일\"') AS ENROLL_DATE FROM BOARD B JOIN MEMBER M ON M.NO = B.WRITER_NO WHERE B.DEL_YN = 'N' ORDER BY B.NO ASC";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();

		// rs
		List<BoardVo> voList = new ArrayList<BoardVo>();
		while (rs.next()) {
			String no = rs.getString("NO");
			String title = rs.getString("TITLE");
			String writerNick = rs.getString("WRITER_NICK");
			String hit = rs.getString("HIT");
			String enrollDate = rs.getString("ENROLL_DATE");

			BoardVo vo = new BoardVo();
			vo.setNo(no);
			vo.setTitle(title);
			vo.setWriterNick(writerNick);
			vo.setHit(hit);
			vo.setEnrollDate(enrollDate);

			voList.add(vo);
		}

		// close
		JDBCTemplate.close(rs);
		JDBCTemplate.close(pstmt);

		return voList;
	}

	public BoardVo boardDetailDyNo(Connection conn, String num) throws Exception {
		// SQL
		String sql = "SELECT B.NO , B.TITLE , B.CONTENT , M.NICK AS WRITER_NICK, B.HIT , TO_CHAR(B.ENROLL_DATE,  'MM/DD') AS ENROLL_DATE , B.MODIFY_DATE FROM BOARD B JOIN MEMBER M ON B.WRITER_NO = M.NO WHERE B.NO = ? AND B.DEL_YN = 'N'";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, num);
		ResultSet rs = pstmt.executeQuery();

		// rs
		if (rs.next()) {
			String no = rs.getString("NO");
			String title = rs.getString("TITLE");
			String content = rs.getString("CONTENT");
			String writerNick = rs.getString("WRITER_NICK");
			String hit = rs.getString("HIT");
			String enrollDate = rs.getString("ENROLL_DATE");
			String modifyDate = rs.getString("MODIFY_DATE");
			
			BoardVo vo = new BoardVo();
			vo.setNo(no);
			vo.setTitle(title);
			vo.setContent(content);
			vo.setWriterNick(writerNick);
			vo.setHit(hit);
			vo.setEnrollDate(enrollDate);
			vo.setModifyDate(modifyDate);

		}

		// close
		JDBCTemplate.close(pstmt);

		return null;
	}

}
