package main;

import car.Avante;
import car.Car;
import car.Lcid;
import car.Sonata;

public class Main {

	public static void main(String[] args) {

		System.out.println("추상화~~~");
		
		Car sonata = new Sonata();
		Car avante = new Avante();
		Car lcid = new Lcid();
		
		sonata.setPrice(3000);
		sonata.setColor("rad");
		sonata.setSpeed(100);
		sonata.accelerate();
		System.out.println(sonata);
		
		avante.setPrice(3500);
		avante.setColor("blue");
		avante.setSpeed(120);
		avante.accelerate();
		System.out.println(avante);
		
		lcid.setPrice(4000);
		lcid.setColor("purple");
		lcid.setSpeed(95);
		lcid.accelerate();
		System.out.println(lcid);
		
//		sonata.accelerate();
//		avante.accelerate();
		
	}

}
