package practice;

public class MethodTest {

	/*
	 * 메소드 : 명령어 모아놓은것
	 * 
	 * 명명 : 동사형태로 작성 , camelCase
	 * 
	 * - 하나의 동작만 수행하는게 좋음(가는한 작은 단위)
	 * - 메소드 이름을 보고 내용을 파악하기 쉽게
	 * 
	 * [문법] public void test(){명령;~~~~}
	 * 
	 * 기본 : 접근 제한자 리턴타임 메소드명(){명령;~~~~}
	 * 
	 * 데이터를 받는 : 접근 제한자 리턴타임 메소드명(매개변수,...-파라미터){명령;~~~~}
	 * 
	 * 데이터를 반환하는 : 접근 제한자 리턴타임 메소드명(){~~~~; return 값;}
	 * 
	 * 데이터를 받고, 반환하는 : 접근 제한자 리턴타임 메소드명(매개변수){~~~~; return 값;}
	 * 
	 */

	// 기본
	public void test() {
		System.out.println("안녕");
	}

	// 매개변수 있는 (1개)
	public void test01(int x) {
		System.out.println(x);
	}

	// 매개변수 있는 (2개)
	public void test02(int x, int y) {
		int result = x+y;
		System.out.println(result);
	}

	// 리턴값이 있는 (리턴값은 여러개 불가능)
	public int test03() {
		int x = 123;
		return x;
	}

	// 매개변수 있는, 리턴값있는
	public int test04(int x, int y) {
		int result = x+y;
		return result;

	}

}
