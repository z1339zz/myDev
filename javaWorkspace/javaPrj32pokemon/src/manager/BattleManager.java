package manager;

import main.Main;
import mod.Pokemon;
import util.Myutil;

public class BattleManager {
	
	// 유저 vs 적
	public void battleStart() {
		boolean isFinish = false;

		// 두 포켓몬의 정보 출력
		printPokemonInfo();

		while (true) {
			// 유저 행동 입력받기 (1. 몸통박치기 2. 스킬 3. 도망)
			int num = scanUserAction();
			
			if(num == 3) {
				Pokemon.Run();
				break;
			}
			// 입력값에 따라 행동
			isFinish = fight(Main.userPokemon, Main.EnemyPokemon, num);
			if (isFinish) {
				// 결과 출력
				System.out.println("유저 승리!!!!");
				System.out.println("=======배틀 종료=======");
				// 배틀종료
				return;
			}

			// 적 행동 랜덤값에 따리 공격 (1. 몸통박치기 2. 스킬)
			isFinish = fight(Main.EnemyPokemon, Main.userPokemon, Myutil.getRandomInt(1, 2));
			if (isFinish) {
				System.out.println("적 승리!!!");
				System.out.println("=======배틀 종료=======");
				return;
			}
		}
	}

	private int scanUserAction() {

		while (true) {
			// 행동 목록 보여주기
			printActionList();

			// 유저 입력 받기
			int num = Main.scanner.nextInt();
			if (num <= 3) {
				return num;
			} else {
				System.out.println("잘못된 입력입니다. 보기에서 골라주세요");
			}
			
		}

	}

	private boolean fight(Pokemon attacker, Pokemon deffender, int num) {
		// 공격 메소드 호출
		switch(num) {
		case 1 : attacker.bodyAttack(); break;
		case 2 : attacker.skill(); break;
		}

		// 데미지 계산
		int damage = attacker.getAtk() * num - deffender.getDef();
		System.out.println(attacker.getName() + "이(가)" + damage + "의 공격력으로 공격!");
		// 체력 감소
		deffender.setHp(deffender.getHp() - damage);
		System.out.println(deffender.getName() + " 남은 체력은 : " + deffender.getHp());
		// 죽었는지 체크
		if (deffender.getHp() <= 0) {
			return true;
		} else {
			return false;
		}

	}

	private void printActionList() {

		System.out.println("----- 원하시는 행동의 번호를 입력하세요 -----");
		System.out.println("1. 몸통박치기");
		System.out.println("2. 스킬");
		System.out.println("3. 도망");
		
		

	}

	private void printPokemonInfo() {
		System.out.println("----- 유저 포겟몬 정보 -----");
		System.out.println(Main.userPokemon.toString());
		System.out.println("");

		System.out.println("----- 적 포겟몬 정보 -----");
		System.out.println(Main.EnemyPokemon.toString());
		System.out.println("");
	}

}
