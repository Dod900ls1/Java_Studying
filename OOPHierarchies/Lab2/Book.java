package Lab2;

public class Book extends Item {

	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	public Book(String title, double price, int quantity, 
			String author, String publisher, String category) {
		super(title, price, quantity);
		this.setAuthor(author);
		this.setPublisher(publisher);
		this.setCategory(category);
	}
	
	private String author;
	private String publisher;
	private String category;
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
}
