package com.kh.app.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

import com.kh.app.dao.MemberDao;
import com.kh.app.jdbc.JDBCTemplate;
import com.kh.app.service.MemberService;
import com.kh.app.vo.MemberVo;

public class MemberController {

	// 멤버변수 == 필드
	private final Scanner sc;
	private final MemberDao dao;
	private final MemberService ms;

	// 기본생성자
	public MemberController() {
		sc = new Scanner(System.in);
		dao = new MemberDao();
		ms = new MemberService();
	}

	// 메뉴 선택
	public void selectMenu() {

		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 회원 목록 조회");

		String num = sc.nextLine();

		switch (num) {
		case "1":
			join();
			break;
		case "2":
			login();
			break;
		case "3":
			printMemberList();
			break;
		default:
			System.out.println(" 없는 메뉴 ");
		}
	}

	// 회원가입
	public void join() {
		System.out.println("-----회원가입-----");

		// 데이터 준비
		System.out.println("아이디 : ");
		String id = sc.nextLine();
		System.out.println("비밀번호 : ");
		String pwd = sc.nextLine();

		MemberVo vo = new MemberVo();
		vo.setId(id);
		vo.setPwd(pwd);

		// 서비스
		try {
			int result = ms.join(vo);

			// 결과처리
			if (result == 1) {
				System.out.println("회원가입 성공 ");
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
		// 데이터 준비
		System.out.println("-----로그인-----");

		System.out.println("아이디 : ");
		String id = sc.nextLine();
		System.out.println("비밀번호 : ");
		String pwd = sc.nextLine();

		MemberVo vo = new MemberVo();
		vo.setId(id);
		vo.setPwd(pwd);

		// 서비스 호출
		try {
			MemberVo dbVo = ms.login(vo);

			// result(tx , rs)
			if (dbVo != null) {
				System.out.println("로그인 성공 !!!");
			} else {
				throw new Exception();
			}

		} catch (Exception e) {
			System.out.println("로그인 실패 ...");
			e.printStackTrace();

		}

	}

	// 전체회원조회
	public void printMemberList() {
		System.out.println("-----전체 회원 목록 조회-----");

		// 데이터 준비
		
		// 서비스 호출
		try {
		ArrayList<MemberVo> voList = ms.getMemberList();
		
		// 결과 처리
		for(int i = 0; i < voList.size(); ++i) {
			System.out.println(voList.get(i));
		}
		
		}catch(Exception e) {
			System.out.println("회원 목록 조회 실패 ...");
			e.printStackTrace();
		}
		

	}

}
