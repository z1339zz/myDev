package date;

public class Person {

	
	//기본 생성자 //파라미터 X, JVM이 자동으로 만들어줌(다른 생성자가 없을 때)
	public Person() {
		
	}
	
	
	// 멤버 변수
	private String name;
	private int age; // 음수 ㄴㄴ, 기존 보다 작게 ㄴㄴ
	private char gender; // M , F

	// 멤버 메소드
	public void breath() {
		System.out.println("호흡");

	}

	public void setName(String name) {
		if (name.length() < 2) {
			System.out.println("잘못된 입력입니다.");
		} else {
			this.name = name;
		}
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		if (age <= 0 || this.age > age) {
			System.out.println("잘못된 입력입니다.");
		} else {
			this.age = age;
		}
	}

	public int getAge() {
		return age;
	}

	public void setGender(char gender) {
		if (gender == 'M' || gender == 'F') {
			this.gender = gender;
		} else {
			System.out.println("잘못된 입력입니다.");
		}
	}

	public char getGender() {

		return gender;
	}

//	// 객체 안의 모든 멤버변수(==필드)를 출력하는 메소드
//	public void getFieldInfo() { //메소드 헤드(시그니쳐)
//		System.out.println(this.name);  //메소드 바디
//		System.out.println(this.age);  //메소드 바디
//		System.out.println(this.gender);  //메소드 바디

	// 객체 안의 모든 멤버변수(==필드)들의 정보를 리턴하는 메소드
	public String getFieldInfo() {
		return "name : " + this.name + ", age : " + this.age + ", gender : " + this.gender;

	}

}// class
