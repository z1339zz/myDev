package main;

import java.awt.Paint;

import mob.Gobugi;
import mob.Paire;
import mob.Pikachu;
import mob.Pokemon;

public class Main {

	private static Pokemon pokemon;

	public static void main(String[] ages) {
		
		System.out.println("=====상속=====");
//		
//		Pokemon pokemon = new Pokemon();
//		pokemon.setName("피카츄");
//		pokemon.setHp(100);
//		pokemon.setAtk(30);
//		pokemon.setDef(10);
//		
//		System.out.println(pokemon.getName());
//		System.out.println(pokemon.getHp());
//		System.out.println(pokemon.getAtk());
//		System.out.println(pokemon.getDef());
//		
//		System.out.println(pokemon.toString());
		
		//======================================
		
		Pikachu pikachu = new Pikachu();
		System.out.println(pikachu.toString());
		
		Paire paire = new Paire();
		System.out.println(paire.toString());
		
		Gobugi gobugi = new Gobugi();
		System.out.println(gobugi.toString());
		
	}//main
}//class
