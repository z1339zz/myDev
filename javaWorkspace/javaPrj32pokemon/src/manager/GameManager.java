package manager;

import main.Main;

public class GameManager {
	public boolean reStart() {
		
		
		System.out.print("다시 시작하시겠습니까? yes or no? : ");

		while (true) {
			String replay = Main.scanner.next();
			if (replay.equals("yes")) {
				System.out.println("게임이 시작되었습니다.");
				return Main.askEnd = true;
			} else if (replay.equals("no")) {
				System.out.println("감사합니다");
				return Main.askEnd = false;
			} else {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요");
			}
		}
		

	}

}
