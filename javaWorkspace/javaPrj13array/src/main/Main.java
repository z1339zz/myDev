package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc =  new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] score = new int[n];
		
		for(int i = 0; i < score.length; i++) { 
			score [i] = sc.nextInt(); 
			System.out.println(score[i]);
		}
		
		
	
	}

}
