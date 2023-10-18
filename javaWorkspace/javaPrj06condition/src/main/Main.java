package main;

public class Main {

	public static void main(String[] args) {
		

	
	/*
	 * <조건문>
	 * - 조건 맞으면 코드 실행
	 * - if, else, else if
	 * 
	 * [문법]
	 * if(조건식){ 실행내용(여러개의 명령문 작성 가능) } - 조건식이 true일 때만 실행
	 * if(조건식){명령~~}
	 * else if(조건식){명령~~}
	 * else {명령~~}
	 * 
	 * 
	 * */
	
//		int age = 10;
//	if (age >= 20) {
//	System.out.println("성인입니다.");
//
//	  }else {
//		System.out.println("미성년자 입니다.");
//	}
		
		
		int num = 0;
		if (num > 0 ) {
		     System.out.println("양수");
		} else if (num < 0){
		     System.out.println("음수");
		} else {
			System.out.println("zero");
		}
	}
}
