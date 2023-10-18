package car;

public abstract class Car {

	// 멤버 변수
	private int price;
	private String color;
	private int speed;

	// 멤버 메소드
	// 악셀 밟았을 때 실행될 내용
	public abstract void accelerate();

	// 모든 필드 정보 확인
	@Override
	public String toString() {
		return "Car [price=" + price + ", color=" + color + ", speed=" + speed + "]";
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
