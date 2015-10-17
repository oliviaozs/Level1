public class EatCandy {
	public static void main(String[] args) {
		Personn olivia = new Personn("olivia");
		Candy candy = new Candy("hershey", "dark chocolate", "red");
		olivia.unwrap(candy);
		olivia.smell(candy);
		olivia.chew(candy);
	}
}

class Personn {
	private String name;

	Personn(String name) {
		this.name = name;
	}

	void unwrap(Candy candy) {
		System.out.println(name + " is unwrapping " + candy.getColor() + " "
				+ candy.getFlavor() + " " + candy.getBrand());
	}

	void chew(Candy candy) {
		System.out.println(name + " is chewing " + candy.getColor() + " "
				+ candy.getFlavor() + " " + candy.getBrand());
	}

	void smell(Candy candy) {
		System.out.println(name + " is smelling " + candy.getColor() + " "
				+ candy.getFlavor() + " " + candy.getBrand());
	}

}

class Candy {
	private String brand;
	private String flavor;
	private String color;

	public String getBrand() {
		return brand;
	}

	public String getFlavor() {
		return flavor;
	}

	public String getColor() {
		return color;
	}

	Candy(String brand, String flavor, String color) {
		this.brand = brand;
		this.flavor = flavor;
		this.color = color;
	}

}
