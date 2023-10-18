package battle;

import mod.Pokemon;

public class BattleManager {

	// 승자
	String winner = null;

	Pokemon p1 = new Pokemon();
	Pokemon p2 = new Pokemon();

	// 포겟몬 생성 메소드
	public void generatePokemon() {

		p1.name = "피카츄";
		p1.hp = 100;
		p1.atk = 30;

		p2.name = "파이리";
		p2.hp = 90;
		p2.atk = 33;
	}

	// 배틀시작
	public void battleStart() {

		// 포켓몬 2마리 생성
		this.generatePokemon();

		// 번갈아가며 공격
		while (winner == null) {
			mobAttack(p1, p2);
			p1.attack();
			if (winner != null) {break;}
			mobAttack(p2, p1);
			p2.attack();
			if (winner != null) {break;}

		}

		// 결과 출력
		System.out.println("승자는 " + winner);

	}

	public void mobAttack(Pokemon Attacker, Pokemon deffenser) {

		// p1이(가) p2를 공격
		System.out.println(Attacker.name + " 이(가) " + deffenser.name + "를 공격함");
		// 공격마다 데미지 계산하여 체력 감소
		deffenser.hp -= Attacker.atk;
		// 체력 출력
		System.out.println(deffenser.name + "의 남은 체력은 : " + deffenser.hp);
		// 승패 판단
		if (deffenser.hp <= 0) {
			winner = Attacker.name;

		}

	}

}// class
