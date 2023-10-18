package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import data.Member;

public class MemberManager {

	// 멤버변수
	private Scanner sc = new Scanner(System.in);
	Map<String, Member> memberMap = new HashMap<String, Member>();

	// 일 시작
	public void startWork() {

		showMenu();

		String inPut = scanUserString();
		switch (inPut) {
		case "1":
			join();
			break;
		case "2":
			login();
			break;
		default:
			System.out.println("이거 아님");
		}

	}

	// 메뉴 보여주기
	public void showMenu() {
		System.out.println("---------------------");
		System.out.println("원하시는 메뉴 번호를 입력하세요");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("---------------------");
	}

	// 입력받기
	public String scanUserString() {
		return sc.nextLine();
	}

	// 회원가입
	public void join() {
		System.out.println("회원가입");

		System.out.print("아이디 : ");
		String id = scanUserString();

		System.out.print("비밀번회 : ");
		String pwd = scanUserString();

		System.out.print("닉네임 : ");
		String nick = scanUserString();

		Member m = new Member(id, pwd, nick);

		// 값 검증
//		try {
//		checkValidation(m);
//		}catch(Exception e){
//			System.out.println("잘못입력했음");
//		}
//		// 멤버 객체 저장
//		memberMap.put(m.getId(), m);
//
//		System.out.println(m.getId() + "의 회원가입 완료");

	}


	//값 검증
	private void checkValidation(Member m) throws Exception{
		//아이디 검사
		checkId(m.getId());
		//비밀번호 검사
		
		//닉네임 검사
	}

	private void checkId(String id) throws Exception{
		
		if(id.length() < 4) {
			throw new Exception();
		}
	}

	// 로그인
	public void login() {
		System.out.println("로그인");

		System.out.println("아이디 : ");
		String userId = sc.nextLine();

		System.out.println("비밀번호 : ");
		String userPwd = sc.nextLine();

		Member x = memberMap.get(userId);

		boolean result = (userId.equals(x.getId()) && userPwd.equals(x.getPwd()));

		if (result) {
			System.out.println("로그인 성공");
			System.out.println(userId + "님 환영합니다!!");
		} else {
			System.out.println("로그인 실패");
		}

	}
}
