package entities;

public class Product {
	String name;
	private double price;
	
	public Product() { }

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
}