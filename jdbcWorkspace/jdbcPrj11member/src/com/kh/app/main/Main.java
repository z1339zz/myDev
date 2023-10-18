package com.kh.app.main;

import com.kh.app.controller.MemberController;

public class Main {

	public static void main(String[] args) {

		System.out.println("===== 회원 관리 프로그램 =====");
		
		MemberController mc = new MemberController();
		mc.selectMenu();
		
//		< layer분리 : C - S - D    ,  VO  >
//		<컨트롤러 계층>
//		- 데이터
//		- 서비스 호출
//		- 결과처리
//
//		<서비스 계층>
//		- conn
//		- DAO 호출
//		- tx
//		- close
//
//		<DAO 계층>
//		- sql
//		- rs
		
	}

}
