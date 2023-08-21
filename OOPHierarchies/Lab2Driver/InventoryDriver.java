package Lab2Driver;
import java.util.Date;
import Lab2.Artist;
import Lab2.Book;
import Lab2.CD;
import Lab2.ClassicalCD;
import Lab2.Item;
import Lab2.Inventrory;


public class InventoryDriver {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Item[] myInventory = new Item[50];
		
		String[] performers1 = {"Henry", "Elizabeth", "Franz", "Arther"};
        myInventory[0] = new Book("Book 1", 19.99, 3, "Author 1", "Publisher 1", "Category 1");
        myInventory[1] = new Book("Book 2", 12.49, 5, "Author 2", "Publisher 2", "Category 2");
        myInventory[2] = new Book("Book 3", 8.99, 2, "Author 3", "Publisher 3", "Category 3");
        myInventory[3] = new Book("Book 4", 15.75, 7, "Author 4", "Publisher 4", "Category 4");
        myInventory[4] = new Book("Book 5", 10.00, 1, "Author 5", "Publisher 5", "Category 5");
        myInventory[5] = new CD("Going For The One", 12.95, 4, new Artist("YES"), new Date("07/07/1977"));
        myInventory[6] = new CD("Going Down The Country", 12.95, 10, new Artist("Bozos"), new Date("09/07/1987"));
        myInventory[7] = new CD("Polka Favorites", 2.95, 4, new Artist("Jimmy and the Yuppers"), new Date("07/07/1955"));
        myInventory [8] = new ClassicalCD("Romeo and Juliet", 22.95, 1, "Joe Green", performers1, "New York", new Date("01/01/2001"));
        Inventrory.produceReport(myInventory);
	}
	

	
}
