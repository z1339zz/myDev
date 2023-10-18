package game.rcp;

import main.Main;

public class RcpGemaManager {

	public void rcpGemaStart() {
		
		System.out.println("가위 바위 보 중에 하나를 입력해주세요 : ");
		String status = null;
		// 유저 입력받기
		String rcp = Main.scanUserInput(); // 입력 받을 준비
		String user = rcp.toString();

		// 컴퓨터 랜덤 출력
		int num = (int) (Math.random() * 3 + 1);
		
		String com = null;

		switch (num) {
		case 1:
			com = "가위"; break;
		case 2:
			com = "바위"; break;
		case 3:
			com = "보"; break;
		}
		// 승패 판단
		// 판단 (문자열 비교는 x.equals(y))
		if (com.equals(user)) {
			status = "draw";
		} else if (com.equals("가위") && user.equals("바위")) {
			status = "win";
		} else if (com.equals("가위") && user.equals("보")) {
			status = "lose";
		} else if (com.equals("보") && user.equals("바위")) {
			status = "win";
		} else if (com.equals("보") && user.equals("가위")) {
			status = "lose";
		} else if (com.equals("바위") && user.equals("가위")) {
			status = "win";
		} else if (com.equals("바위") && user.equals("보")) {
			status = "lose";
		} 

		// 판단 결과에 따라 출력문 실행
		System.out.println("유저 : " + user + " 컴퓨터 : " + com);
		if (status.equals("win")) {
			System.out.println("user win");
		}else if (status.equals("lose")){
			System.out.println("user lose");
		}else {
			System.out.println("Draws");
		}

	}
}
