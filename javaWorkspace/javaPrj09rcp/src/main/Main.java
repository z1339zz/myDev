package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("게임 시작~~~");
		
		String status = "";
		
		
		while(true) {
			
			//컴퓨터 패 준비
			int num = (int)(Math.random()*3+1);

			String com = ""; /* 변수는 하나 중복 불가능, 블록에서 나갈 수 없음
			                 *소속된 블럭에서만 존재 가는, 이 외의 블럭에서는 영향력 없음
			                 *
			                 */
			
//			if (num == 1) {
//				com = "가위";  // 변수 선언은 불가능, 할당만 가능, init == declare + allocate
//			} else if(num == 2) {
//				com = "바위";
//			} else {
//				com = "보";
//			}
		
			switch (num) {
			case 1 : com = "가위"; break;
			case 2 : com = "바위"; break;
			case 3 : com = "보"; break;
			}

			//유저 패 준비
			
			Scanner sc = new Scanner(System.in);
			String user = sc.nextLine();
			
			//유저 패 이상하면 다시 준비
			if(!user.equals("고영대") && !user.equals("가위")&& !user.equals("바위") && !user.equals("보")) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
				
				
			}

			
			
			//판단 (문자열 비교는 x.equals(y))
			if( com.equals(user) ) {
				status = "draw";
			} else if(com.equals("가위") && user.equals("바위")) {
				status = "win";		
			}
			else if(com.equals("가위") && user.equals("보")) {
				status = "lose";			}
			 else if(com.equals("보") && user.equals("바위")) {
				 status = "win";
			}
			else if(com.equals("보") && user.equals("가위")) {
				status = "lose";
				}
			else if(com.equals("바위") && user.equals("가위")) {
				status = "win";
				}
			else if(com.equals("바위") && user.equals("보")) {
				status = "lose";
				}
			else if(user.equals("고영대")) {
				status = "win";
			}
			
				//판단 결과에 따라 출력문 실행
			System.out.println("유저 : " + user + " 컴퓨터 : " + com);
			if(status.equals("win")) {
				System.out.println("user win");
				
					while (true) {
					//재경기 희망 여부 체크
					System.out.println("게임을 다시 실행하시겠습니까?(yes or no)");
					Scanner sc2 = new Scanner(System.in);
					String reply = sc2.nextLine();
					
					if (reply.equals("yes")) {
				        // 게임 다시 시작
						break;
				    } else if (reply.equals("no")) {
				       
				        System.out.println("===게임 종료==="); 
				        break;
				    } else {
				        System.out.println("잘못된 입력입니다. yes 또는 no로 대답해주세요.");
				    }
				
					}
					
			}else if (status.equals("lose")) {
				System.out.println("user lose");
			}else { 
				System.out.println("draw");
			}
			
		} //while
		
		
		
	} //main

}//class
