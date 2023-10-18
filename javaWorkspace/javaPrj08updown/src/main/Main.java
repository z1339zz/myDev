package main;

import java.util.Scanner; //Scanner : Ctel + 스페이스바

public class Main {

	//업다운게임
	public static void main(String[] args) {

		
		//시도횟수
		int cnt = 0;
		
		//정답 숫자 준비
		int answer = (int)(Math.random()*3+1);
		
		//반복(정답까지)
		while(true) {
			//유저한테 숫자 입력받기
			Scanner sc = new Scanner(System.in); // 입력 받을 도구 준비(객체 준비)
			int x = sc.nextInt(); // 입력 받을 준비
			
			//시도 횟수 증가
			cnt++;
			
			//업, 다운, 정답 판단
			if(x < answer) {
				System.out.println("업");
			}else if(x > answer) {
				System.out.println("다운");
			}else {
				System.out.println("정답");
				System.out.println("시도 횟수 : " + cnt);
				break; //정답 맞춤(정지)
			}
		}
		
	} //main

} //class
