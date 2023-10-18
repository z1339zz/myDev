package main;

public class Main {

	public static void main(String[] args) {

		System.out.println("맥날");
		
		Burger b1 = new Burger("치즈버거" , 5000);
		Burger b2 = new Burger("불고기버거" , 5500);
		Burger b3 = new Burger("빅맥" , 6000);
		
		String s = b1.getName();
		System.out.println(s);
		
		int p = b1.getPrice();
		System.out.println(p);
	}

}
