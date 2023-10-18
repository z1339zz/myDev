package loop;

public class Main {

	public static void main(String[] args) {

		

		/*
		 * 반복문
		 * 
		 * while, for , do- while
		 * 초기식, 조건식, 증감식
		 * break : 현재 반복문 종료
		 * continue : 반복문의 처음으로 이동
		 * 
		 * */

		/*
		 * [while] 문법
		 * while (조건){실행내용}
		 * */

//     	    int x = 1;       //초기식
//	    	while (x < 5) {  //조건식
//                System.out.println("안녕");
//		        x = 1 + x;   //증감식(n번 반복)

//		}
		
		/*
		 * 
		 * [for]문법
		 * for(초기식; 조건식; 증감식){실행내용}
		 * 
		 * [do-while]문법
		 * do{실행내용}(조건식);
		 * 
		 * 
		 * */
		
//		for(int x = 7; x > 5; x--) {
//			System.out.println("안녕");
//			
//		}
//		
//		
		
//		
//		do {
//			System.out.println("안녕");
//		}while(false);
//		
//		
//		
//		
		
//		int x = 0;
//		
//		while(x < 3) {
//			System.out.println("안녕");
//			if(x==1) {
//				continue;
//			}
//			System.out.println("잘가");
//			x++;
//		}
		
		
		
		for(int i = 0; i<3; i++) {
			System.out.println("안녕");
			if( i == 1) {
				continue;
			}
			System.out.println("잘가");
		}
		
		
		
	}//main

}//class
