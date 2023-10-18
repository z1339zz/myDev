package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		
		System.out.println("-----회원가입-----");
		
		//연결 준비
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String id = "C##KH_JDBC";
		String pwd = "1234";
		
		//디비 연결 == conn 얻기
		Connection conn = DriverManager.getConnection(url, id, pwd);
		
		//입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String userId = sc.nextLine();
		System.out.print("패스워드 : ");
		String userPwd = sc.nextLine();
		
		//쿼리 실행
		String sql = "INSERT INTO MEMBER(ID, PWD) VALUES(?, ?)";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, userId);
		pstmt.setString(2, userPwd);
		int result = pstmt.executeUpdate();
		
		if(result == 1) {
			System.out.println("회원가입 성공 !");
		}else {
			System.out.println("회원가입 실패 ...");
		}

	}//main

}//class







