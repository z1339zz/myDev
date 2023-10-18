package hello;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a>=b) {
			for(int num = b ; num <=a ; num++) {
				if(num%2!=0) {
				System.out.print(num+" ");
				} else {
					System.out.print(num+" ");
				}
			}
		    }else if(a<=b) {
				for(int num = a ; num <=b ; num++ ) {
					if(num%2!=0) {
						System.out.print(num+" ");
						} else {
							System.out.print(num+" ");
						}
		}
		
		}
	}
}
//%2 = 0