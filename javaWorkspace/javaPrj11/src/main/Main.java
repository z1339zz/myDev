package main;

import java.util.Scanner;

public class Main {

	   public static void main(String[] args){
	 
		   //키와 몸무게 입력 도구
		   Scanner sc = new Scanner(System.in);
		   //입력 도구 사용
		   double height = sc.nextDouble();
		   double weight = sc.nextDouble();
		   
		   double stdWeight;
		   double BMI;
		   //표준몸무게 계산 비만도 계산
		 if(height<150) {
			stdWeight = height - 100;
			BMI = (weight-stdWeight)*100/stdWeight;
			System.out.println(BMI);
			if(BMI<=10) {
				System.out.println("정상");
			}else if (10<BMI && BMI<=20) {
			System.out.println("과체중");
			}else {
				System.out.println("비만");
			}
			
		 }else if( 150<=height && height<160 ){
			stdWeight = (height-150)/2+50;
			BMI = (weight-stdWeight)*100/stdWeight;
			System.out.println(BMI);
			if(height<=10) {
				System.out.println("정상");
			}else if (10<BMI && BMI<=20) {
			System.out.println("과체중");
			}else {
				System.out.println("비만");
			}
		 }else {
			stdWeight = (height-100)*0.9;
			BMI = (weight-stdWeight)*100/stdWeight;
			System.out.println(BMI);
			if(BMI<=10) {
				System.out.println("정상");
			}else if (10<BMI && BMI<=20) {
			System.out.println("과체중");
			}else {
				System.out.println("비만");
			}
		 }
		 
		
			 
		 }
		  
	   }
	