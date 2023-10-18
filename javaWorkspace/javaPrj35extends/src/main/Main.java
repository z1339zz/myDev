package main;

import car.Avante;
import car.Sonata;

public class Main {

	public static void main(String[] args) {

		System.out.println("상속");
		
		Sonata sonata = new Sonata();
		sonata.accelerate();
		
		Avante avante = new Avante();
		avante.accelerate();
		avante.toString();
	}

}
