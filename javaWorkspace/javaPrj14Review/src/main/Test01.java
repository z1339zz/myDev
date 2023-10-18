package main;

public class Test01 {

	// 변수
	public void hello() {
		byte x = 127;
		int a = 10;
		long b = 20;
		double d = 2.14;
		boolean isOk = true;
		char ch = 'A';
		
		String str	= "zzz";
		
		//컴퓨터는 타입이 다르면 연산 불가
		//그래서 컴퓨터가 알아서 타입 변환 (auto casting)
		
		//개발자가 강제로 타입 변환도 가능
		//(변환시킬타입) 데이터;
		
		//변수명명 규칙 : camelCase, 얘약어X , 특수문자 &,_
		
		
		System.out.println(a);
		System.out.println(x);
		System.out.println(b);
		System.out.println(d);
		System.out.println(isOk);
		System.out.println(str);
	}
	
}
