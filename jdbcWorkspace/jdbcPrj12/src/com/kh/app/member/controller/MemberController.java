package com.kh.app.member.controller;

import java.util.Scanner;

import com.kh.app.member.service.MemberService;
import com.kh.app.member.vo.MemberVo;

public class MemberController {

	// 필드
	private final Scanner sc;
	private final MemberService me;

	public MemberController() {

		sc = new Scanner(System.in);
		me = new MemberService();
	}

	// 메뉴선텍

	// 회원가입
	public void join() {
		System.out.println("-----회원가입-----");

		// 데이터
		System.out.println("아이디 : ");
		String id = sc.nextLine();
		System.out.println("비밀번호 : ");
		String pwd = sc.nextLine();
		System.out.println("닉네임 : ");
		String nick = sc.nextLine();

		MemberVo vo = new MemberVo();
		vo.setId(id);
		vo.setPwd(pwd);
		vo.setNick(nick);

		// 서비스
		int result = 0;

		try {
			result = me.join(vo);

			// 결과
			if (result == 1) {
				System.out.println("회원가입 성공");
			} else {
				throw new Exception();
			}

		} catch (Exception e) {
			System.out.println("회원가입 실패");
			e.printStackTrace();
		}

	}

	// 로그인
	public void login() {

		// 데이터

		// 서비스

		// 결과

	}

	// 전체 회원모록 조회
	public void printMemberList() {

		// 데이터

		// 서비스

		// 결과
	}

	// 회원탈퇴
	public void quit() {
		System.out.println("회원 탈퇴");

		// 데이터
		System.out.println("아이디 : ");
		String id = sc.nextLine();
		System.out.println("비밀번호 : ");
		String pwd = sc.nextLine();

		// 서비스
		MemberVo vo = new MemberVo();
		vo.setId(id);
		vo.setPwd(pwd);

		// 결과
		int result = 0;

		try {
			result = me.join(vo);

			// 결과
			if (result == 1) {
				System.out.println("회원탈퇴 성공");
			} else {
				throw new Exception();
			}

		} catch (Exception e) {
			System.out.println("회원탈퇴 실패");
			e.printStackTrace();
		}

	}

	// 비밀번호 변경
	public void editPwd() {
		
	}

}
