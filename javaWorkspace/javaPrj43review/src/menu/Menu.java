package menu;

public class Menu {
	
	private String name;
	private int price;
	
	public Menu() {
		super();
	}

	public Menu(String name, int peice) {
		super();
		this.name = name;
		this.price = peice;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPeice() {
		return price;
	}
	public void setPeice(int peice) {
		this.price = peice;
	}
	@Override
	public String toString() {
		return "Menu [name=" + name + ", peice=" + price + "]";
	}
	
	

}
