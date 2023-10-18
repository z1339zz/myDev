package main;

public class Run {

	public static void main(String[] args) {
		
		/*
		 * <변수>
		 * 
		 * 변수 : 값을 저장하는 공간
		 * 
		 * [문법]
		 * 변수타입 변수명 = 값;
		 * 
		 *  - 값 의미 파악 용이함
		 *  - 여러곳에서 동일한 값을 사용하는 경우 관리가 편리함
		 *  
		 *  -변수타입들
		 *  -타입별 메모리 크기
		 *  
		 *  변수 명명 규칙
		 *   - 예약어 사용 불가
		 *   - 띄어쓰기 불가능
		 *   - 띄어쓰기 대신 대문자를 사용하는 것을camelCase
		 *   - 띄어쓰기 자리에 _를 사용하는 것을 snake_case
		 */

		//정수 : 기본이 int
		
		byte a = 10;
		System.out.println(a);
		
		short b = 20;
		System.out.println(b);
		
		int c = 30;
		System.out.println(c);
		
		long d = 40;
		System.out.println(d);
		
		//실수 : 기본이 double
		
		float e = 3.14f;
		System.out.println(e);
		
		double f = 3.15;
		System.out.println(f);
		
		/*문자 : 한글자 <=> 문자열 : 문자별영 : 여러문자
		문자 : 따옴표로  표현
		문자열 : 쌍따움표로 표현
		*/
		
		char g = 'A';
		System.out.println(g);
		
		//문자열
		
		String h = "good";
	    System.out.println(h);
		
		//논리
		
		boolean i = true;
		System.out.println(i);
				
		boolean j = false;
		System.out.println(j);
		
		

	}

}
