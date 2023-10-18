package main;

import java.util.Scanner;

import manager.BattleManager;
import manager.GameManager;
import manager.PokemonManager;
import mod.Pokemon;

public class Main {

	public static final Scanner scanner = new Scanner(System.in);
	public static Pokemon userPokemon;
	public static Pokemon EnemyPokemon;
	public static Boolean askEnd;

	public static void main(String[] args) {
		System.out.println("=====포켓몬ver0905=====");

		PokemonManager pokemonManager = new PokemonManager();
		BattleManager battleManager = new BattleManager();
		GameManager gameManager = new GameManager();

		while (true) {
			// 포켓몬 선택
			pokemonManager.selectPokemon();
			// 배틀
			battleManager.battleStart();
			// 재시작
			gameManager.reStart();
			if (askEnd == true) {
				continue;
			}else {
				break;
			}
		}
	}

}
