package practice;

public class ArrayTest {
	
	/*
	 * 
	 * 배열
	 * type[] name = new type[size];
	 * 변수타임[] 변수이름 = new 변수타임[];
	 * int[] arr = new int[3]
	 * 
	 * 타입이 같은 변수를 여러개를 한번에 만들어줌
	 * 주의사항 : 처음부터 사이즈를 지정해야함
	 * 
	 * 다차원 배열
	 * int[][] arr = new int[3][3]
	 * 
	 */
	public void test() {
		
		
		//배열변수 선언
		int [][] x; 
		//배열생성 후 배열변수에 할당
		x = new int[3][3];
		x [0][0] = 0;    //인덱스 칸에 값을 할당
		x [0][1] = 1;
		x [0][2] = 2;
		x [1][0] = 3;
		x [1][1] = 4;
		x [1][2] = 5;
		x [2][0] = 6;
		x [2][1] = 7;
		x [2][2] = 8;
		
		System.out.println(x[0][0]);    //0번 인덱스 칸에 값을 커내오고, 출력
		System.out.println(x[0][1]);
		System.out.println(x[0][2]);
		System.out.println(x[1][0]);
		System.out.println(x[1][1]);
		System.out.println(x[1][2]);
		System.out.println(x[2][0]);
		System.out.println(x[2][1]);
		System.out.println(x[2][2]);
	}

}
