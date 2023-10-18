package report;

import java.util.Scanner;

public class ReportGame {

	public static void main(String[] args) {
		
		 int balance = 1000; // 초기 잔액 설정
	        Scanner scanner = new Scanner(System.in);

	        while (balance > 0) {
	            System.out.println("현재 잔액: " + balance + "원");
	            System.out.print("어떤 물건을 구매하시겠습니까? (사과: 100원, 바나나: 200원, 포도: 300원 / 나가기: 0) ");
	            int choice = scanner.nextInt();

	            if (choice == 0) {
	                System.out.println("게임을 종료합니다.");
	                break;
	            } else if (choice == 1 || choice == 2 || choice == 3) {
	                int price = choice * 100; // 물건 가격 계산
	                if (balance >= price) {
	                    balance -= price;
	                    System.out.println("물건을 구매하였습니다.");
	                } else {
	                    System.out.println("잔액이 부족합니다.");
	                }
	            } else {
	                System.out.println("잘못된 선택입니다.");
	            }
	        }

	        scanner.close();
	} //main
 
} //class