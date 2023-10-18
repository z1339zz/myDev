package member.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class MemberManager {

	private Scanner scanner;
	private File f;
	private PrintWriter pw;
	private BufferedReader br;

	public MemberManager() throws Exception {
		scanner = new Scanner(System.in);
		String x = File.separator;
		f = new File("C:" + x + "java" + x + "dev" + x + "data.txt");
		pw = new PrintWriter(new FileWriter(f, true), true);
		br = new BufferedReader(new FileReader(f));

	}// MemberManager

	// 메뉴
	public void showMenu() throws Exception {
		System.out.println("메뉴");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 전체 회원 조회");
		System.out.println("원하시는 메뉴 번호를 입력하세요.");

		String meun = scanner.nextLine();

		switch (meun) {
		case "1":
			join();
			break;
		case "2":
			login();
			break;
		case "3":
			selectAllUser();
			break;
		default:
			System.out.println("잘못입력하셨습니다.");
		}
	}

	// 회원가입
	private void join() throws Exception {
		// 유저한테 데이터(아이디, 비번, 닉네임) 입력받기
		System.out.print("아이디 : ");
		String id = scanner.nextLine();

		System.out.print("비밀번호 : ");
		String pwd = scanner.nextLine();

		System.out.print("닉네임 : ");
		String nick = scanner.nextLine();
		
		//데이터 검사
		boolean isError = id.contains("#");
		if(isError) {
			throw new Exception("ID에는 #을 사용할 수 없습니다.");
		}

		// 파일(메모장)에 저장하기
		pw.println(id + "#" + pwd + "#" + nick);

		System.out.println("회원가입 완료");
	}// join

	// 로그인
	private void login() throws Exception {
		br = new BufferedReader(new FileReader(f));
		System.out.println("로그인");
		// 유저한테 데이터(아이디, 비번) 입력받기
		System.out.print("아이디 : ");
		String id = scanner.nextLine();

		System.out.print("비밀번호 : ");
		String pwd = scanner.nextLine();

		boolean isOk = false;
		while (!isOk) {

			// 파일에서 회원정보 조회
			String str = br.readLine();

			if (str == null) {
				break;
			}

			// 회원정보에서 id,pwd 만 꺼내기
			int idx = str.indexOf("#");
			String memoId = str.substring(0, idx);

			int idx2 = str.lastIndexOf("#");
			String memoPwd = str.substring(idx + 1, idx2);

			// 일치하는지 확인
			isOk = id.equals(memoId) && pwd.equals(memoPwd);
			if (isOk) {
				break;
			}
		} // while
		if (isOk) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}

	}// login

	// 모든 회원 정보 조회
	private void selectAllUser() throws Exception {
		br = new BufferedReader(new FileReader(f));
		// 파일에서 모든 정보 읽기
		while (true) {
			String str = br.readLine();
			if (str == null) {
				break;
			}
			System.out.println(str);
		}

	}// selsctAllUser
}// class
