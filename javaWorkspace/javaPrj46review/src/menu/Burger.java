package menu;

public class Burger {

	private String name;
	private int price;

	public Burger() {
		super();
	}

	public Burger(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "burger [name=" + name + ", price=" + price + "]";
	}

}
