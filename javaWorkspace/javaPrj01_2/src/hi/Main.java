package hi;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int T = 170;
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a<=T) {
			System.out.println("CRASH " + a);
		}else if(b<=T) {
			System.out.println("CRASH " + b);
		}else if(c<=T) {
			System.out.println("CRASH " + c);
		}else if(a>T && b>T && c>T) {
			System.out.println("PASS");
		}
		
	}//main
}//class
