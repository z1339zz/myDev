package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		
		System.out.println("---회원가입---");
		
		//연결 준비
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String username = "C##KH_JDBC";
		String pwd = "1234";
		
		//디비 연결 == conn 얻기
		Connection conn = DriverManager.getConnection(url , username, pwd);
		
		//데이터 입력받기
		Scanner sc = new Scanner(System.in); 
		System.out.print("아이디 : ");
		String a = sc.nextLine();
		System.out.print("비밀번호 : ");
		String b = sc.nextLine();
		
		//쿼리 실행
		String sql = "INSERT INTO MEMBER(ID, PWD) VALUES('" + a + "' , '" + b + "')";
		
		Statement stmt = conn.createStatement();
		int result = stmt.executeUpdate(sql);
		
		System.out.println("result : " + result);
		

	}//main

}//class














