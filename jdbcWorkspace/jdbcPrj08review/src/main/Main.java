package main;

import member.MemberController;

public class Main {

	public static void main(String[] args) throws Exception {
		
		System.out.println("회원가입 , 로그인 ~~~");
		
		MemberController mc = new MemberController();
		mc.selectMenu();

	}

}
