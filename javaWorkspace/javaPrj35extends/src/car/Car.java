package car;

public class Car {

	public Car() {
		super();
	}

	// 멤버 변수
	int price;
	String color;
	int speed;

	// 멤버 메소드
	public void accelerate() {
		System.out.println("gogo");
	}

	@Override
	public String toString() {
		return "Car [price=" + price + ", color=" + color + ", speed=" + speed + "]";
	}
	
	
}
