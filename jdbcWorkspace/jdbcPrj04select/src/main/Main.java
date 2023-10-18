package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) throws Exception {
		
		System.out.println("-----select-----");

		//연결 준비
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String username = "C##KH_JDBC";
		String pwd = "1234";
		
		//디비 연결 == conn 얻기
		Connection conn = DriverManager.getConnection(url, username , pwd);
		
		//쿼리 실행
		String sql = "SELECT * FROM MEMBER";
		
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		
		
		while(rs.next()) {
			//결과 처리
			String dbId = rs.getString("ID");		//ID 칼럼에 해당하는 데이터 꺼내기
			String dbPwd = rs.getString("PWD");		//PWD 칼럼에 해당하는 데이터 꺼내기
			
			System.out.println("dbId : " + dbId);
			System.out.println("dbPwd : " + dbPwd);
		}
		
	}//main

}//class


























