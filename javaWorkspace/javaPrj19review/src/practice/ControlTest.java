package practice;

public class ControlTest {
	
	/*
	 * 제어문 : 프로그램의 흐름을 제어
	 * 
	 * - 조건문 : 분기점(조건값을 정하해 조건에 만족하면 실행)
	 * if, else if, else
	 * switch - (break)
	 * 삼항연산자
	 * 
	 * - 반복문 :
	 * while
	 * for
	 * do - while
	 * break, continue 
	 * 
	 */
	
	public void test() {
		
		// 조건문 (숫자가 양수?음수?제로?)
		// 반복문 ("안녕" 무한반복 , 1~100 출력)
		
		
		for(int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
		
	}
	public void test1() {
		int x = 0;
		if(x<0) {
			System.out.println("음수");
		}else if (x > 0) {
			System.out.println("양수");
		}else {
			System.out.println("ZERO");
		}
	}

}
