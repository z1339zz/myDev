package data;

public class User {

	// 캡슐화 실습
	// 이름, 나이
	private String name;
	private int age;

	public String getName() {
		return this.name;

	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {

		return age - 1;

	}

	public void setAge(int age) {
		if (age <= 0) {
			System.out.println("oononononononononon");
			return;
		} else if (age <= this.age) {
			System.out.println("nonononononononononon");
		}
		this.age = age;
	}

	/*
	 * 결정사 성별, 나이 , 직업, MBTI, 취미, 연봉, 가족관계, 자가유무, 탈모여부, 형액형, 별자리, 거주지, 키, 몸무게, 질병,
	 * 아이디, 패스워드,
	 */

	/*
	 * 쇼핑몰 성별, 나이, 전화번호, 이메일, 주소, 아이디, 패스워드, 이름, 추천코드, 키, 몸무게,
	 */

	/*
	 * KH정보교육원 학력, 전공, 자격증, 취업여부, 이름, 주민번호, 아이디, 패스워드, 전화번호, 수강하는강좌, 출석,
	 */

}
