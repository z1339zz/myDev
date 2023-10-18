package run;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("학생 수를 입력하세요: ");
		int studentCount = scanner.nextInt();

		String[] studentNames = new String[studentCount];
		double[] studentAverages = new double[studentCount];

		for (int i = 0; i < studentCount; i++) {
			System.out.print("학생 " + (i + 1) + "의 이름을 입력하세요: ");
			studentNames[i] = scanner.next();

			System.out.print("학생 " + (i + 1) + "의 성적 개수를 입력하세요: ");
			int gradeCount = scanner.nextInt();

			double totalGrade = 0;
			for (int j = 0; j < gradeCount; j++) {
				System.out.print("학생 " + (i + 1) + "의 " + (j + 1) + "번째 성적을 입력하세요: ");
				double grade = scanner.nextDouble();
				totalGrade += grade;
			}

			studentAverages[i] = totalGrade / gradeCount;
		}

		for (int i = 0; i < studentCount; i++) {
			System.out.println(studentNames[i] + " 학생의 평균 성적은 " + studentAverages[i] + "입니다.");
		}

		double totalAverage = 0;
		for (double average : studentAverages) {
			totalAverage += average;
		}
		double classAverage = totalAverage / studentCount;

		System.out.println("학급 전체의 평균 성적은 " + classAverage + "입니다.");

	}
}