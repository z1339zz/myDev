package main;

import manager.BattleManager;
import manager.PokemonManager;
import mod.Pokemon;

public class Main {
	
	public static Pokemon pokemon;
	public static Pokemon pokemon2;
	public static Pokemon pokemon3;
	public static Pokemon userPokmon;
	public static Pokemon enemyPokmon;

	public static void main(String[] args) {
		
		BattleManager battleManager = new BattleManager();
		PokemonManager pokemonManager = new PokemonManager();
		
		
		//포켓몬 선택
		pokemonManager.selectPokemon();
		
		//배틀 시작
		battleManager.startBattle();
		

	}

}
