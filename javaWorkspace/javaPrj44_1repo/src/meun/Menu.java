package meun;

public class Menu {

	private String name;
	private int pirce;

	public Menu() {
		super();
	}

	public Menu(String name, int pirce) {
		super();
		this.name = name;
		this.pirce = pirce;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPirce() {
		return pirce;
	}

	public void setPirce(int pirce) {
		this.pirce = pirce;
	}

	@Override
	public String toString() {
		return "Meun [name=" + name + ", pirce=" + pirce + "]";
	}

}
