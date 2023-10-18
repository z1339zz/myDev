package main;

public class TestClass {
	public void method01() {
		System.out.println("method 01 start ╰(*°▽°*)╯");
		method02();
		System.out.println("method 01 end ε=ε=ε=(~￣▽￣)~");
	}
	public void method02() {
		System.out.println("method 02 start");
		int[] arr = new int[3];
		
		try {
			System.out.println(111111);
			arr[7] = 10;
//			int x = 3 / 0;
			System.out.println(2222222);
		}catch(Exception x){
			System.out.println("잡았즄ㅋㅋ");
		}
//		catch (ArithmeticException y) 
//		{
//			System.out.println("0으로 나누려는거 잡음 ㅎㅎ");
//		}
		
		arr[0] = 10;
		method03();
		System.out.println("method 02 end");
	}
	public void method03() {
		System.out.println("method 03 start");
		
		System.out.println("method 03 end");
	}

}
