package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("숫자의 개수를 입력하세요: ");
        int count = scanner.nextInt();
        
        int sum = 0;
        for (int i = 1; i <= count; i++) {
            System.out.print("숫자 #" + i + ": ");
            int number = scanner.nextInt();
            sum += number;
        }
        
        double average = (double) sum / count;
        System.out.println("평균: " + average);
        
        scanner.close();
    }


}
