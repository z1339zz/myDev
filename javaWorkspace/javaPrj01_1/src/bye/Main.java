package bye;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.print("키를 입력하세요 (cm): ");
            double height = sc.nextDouble();
            if (height == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            
            System.out.print("몸무게를 입력하세요 (kg): ");
            double weight = sc.nextDouble();

            double stdWeight;
            double BMI;

            if (height < 150) {
                stdWeight = height - 100;
            } else if (height < 160) {
                stdWeight = (height - 150) / 2 + 50;
            } else {
                stdWeight = (height - 100) * 0.9;
            }

            BMI = (weight - stdWeight) * 100 / stdWeight;
            System.out.println("BMI: " + BMI);

            if (BMI <= 10) {
                System.out.println("정상");
            } else if (10 < BMI && BMI <= 20) {
                System.out.println("과체중");
            } else {
                System.out.println("비만");
            }
        }
        
        sc.close();
    }
}