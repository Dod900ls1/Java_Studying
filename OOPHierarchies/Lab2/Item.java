package Lab2;


public class Item {

	public Item() {
		// TODO Auto-generated constructor stub
	}
	
	public Item(String title, double price, int quantity) {
		this.setTitle(title);
		this.setPrice(price);
		this.setQuantity(quantity);
	}
	
	
	private String title;
	private double price;
	private int quantity;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
	
}
