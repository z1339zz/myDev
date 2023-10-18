package main;

public class run05 {

	public static void main(String[] args) {
//		int month = 1;
//		if (month == 1 || month == 3 || month == 5 || month == 7||month == 8||month == 10||month == 12) {
//			System.out.println("31");
//		}else if(month == 4 || month == 6 || month == 9 || month == 11) {
//			System.out.println("30");
//		}else { 
//			System.out.println("29");
//		}

		int month = 9;
		
		switch (month) {
		case 1 : System.out.println("31"); break;
		case 2 : System.out.println("29");break; 
		case 3 : System.out.println("31");break;
		case 4 : System.out.println("30");break;
		case 5 : System.out.println("31");break;
		case 6 : System.out.println("30");break;
		case 7 : System.out.println("31");break;
		case 8 : System.out.println("31");break;
		case 9 : System.out.println("30");break;
		case 10 : System.out.println("31");break;
		case 11 : System.out.println("30");break;
		case 12 : System.out.println("31");break;
		}
	}

}
