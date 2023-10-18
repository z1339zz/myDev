package main;

import member.controller.MemberManager;

public class Main {

	public static void main(String[] args) throws Exception {

		System.out.println("======회원 관리 프로그램======");

		MemberManager mm = new MemberManager();

		while (true) {
			try {
			mm.showMenu();
			}catch(Exception e) {
				String errorMsg = e.getMessage();
				System.out.println(errorMsg);
				System.out.println("잘못입력하셨습니다. 처음 메뉴로 돌아가나다.");
			}
		}
	}

}
