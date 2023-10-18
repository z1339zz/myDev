package main;

public class Main {

	public static void main(String[] args) {

		System.out.println("======회원======");
		
		MemberManager manager = new MemberManager();
		
		while(true) {
		manager.startWork();
		}
	}

}
