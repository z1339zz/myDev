package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

		System.out.println("-----로그인-----");
		
		//연결 준비
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String id = "C##KH_JDBC";
		String pwd = "1234";
		
		//디비 연결 == conn 얻기
		Connection conn = DriverManager.getConnection(url , id, pwd);

		//입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String a = sc.nextLine();
		System.out.print("비번 : ");
		String b = sc.nextLine();
				
		//쿼리 실행
		String sql = "SELECT * FROM MEMBER WHERE ID = '" + a +"' AND PWD = '" + b + "'";
		Statement stmt = conn.createStatement();
		
		ResultSet rs = stmt.executeQuery(sql);
		
		//결과 처리
		if(rs.next()) {
			String dbId = rs.getString("ID");
			String dbPwd = rs.getString("PWD");
			
			System.out.println("로그인 성공 !");
		}else {
			System.out.println("로그인 실패...");
		}
		
		
	}//main

}//class

























