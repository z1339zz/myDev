package main;

import manager.BattleManager;
import manager.PokemonManager;
import mod.Pokemon;

public class Main {
	
	public static Pokemon pokemon;
	public static Pokemon pokemon2;
	public static Pokemon pokemon3;
	public static Pokemon userPokemon;
	public static Pokemon enemyPokemon;

	public static void main(String[] args) {


		PokemonManager pokeManager = new PokemonManager();
		pokeManager.gameStart();
		
		BattleManager battleManager = new BattleManager();
		battleManager.battleStart();
		
		
	}

}
