package com.kh.app.main;

import com.kh.app.member.controller.MemberController;

public class Main {

	public static void main(String[] args) {

		System.out.println("회원관리");
		
		MemberController mc = new MemberController();
		mc.quit();

	}

}
