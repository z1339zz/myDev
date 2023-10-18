package person;

public abstract class Person extends Object{
	
	protected String name;
	protected String gender;
	protected int age;
	protected String birthday;

	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", age=" + age + ", birthday=" + birthday + "]";
	}

	public abstract void aboutMe();

	public Person(String name, String gender, int age, String birthday) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.birthday = birthday;
	}


	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

}
