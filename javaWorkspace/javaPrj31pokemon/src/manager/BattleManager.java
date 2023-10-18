package manager;

import java.util.Random;

import main.Main;
import mod.Pokemon;

public class BattleManager {

	// 배플 시작
	public void startBattle() {
		int userHp = Main.userPokmon.getHp();
		int enemyHp = Main.enemyPokmon.getHp();

		boolean isDead = false;
		// 번갈아가며 공격
		while (!isDead) {
			// 데미지 계산
			Pokemon attacker = Main.userPokmon;
			Pokemon defender = Main.enemyPokmon;
			attacker.bodyAttack();
			int damage = calcDamage(attacker.getAtk(), defender.getDef());
			System.out.println("데미지 : " + damage);

			// 체력 감소
			enemyHp -= damage;
			System.out.println("남은 체력 : " + enemyHp);

			// 죽음 판단
			isDead = checkHp(enemyHp);

			// 결과 출력
			if (userHp <= 0) {
				System.out.println(Main.enemyPokmon + "의 승리!");
			
			} else if (enemyHp <= 0) {
				System.out.println(Main.userPokmon + "의 승리!");
			} else {
				System.out.println("공격!~~~~");
			}
		}
	}

	private boolean checkHp(int enemyHp) {
		return enemyHp <= 0;
	}

	private int calcDamage(int atk, int def) {
		return atk - def;
		
	}

}
