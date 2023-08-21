package Lab2;

public class Inventrory {

	public Inventrory() {
		// TODO Auto-generated constructor stub
	}
	
	public static void produceReport(Item[] array) {
		int counter1 = 0;
		double counter2 = 0;
		
		System.out.printf("%-30s%10s%5s\n", "Title", "Price", "Quantity");
		
		for(Item item: array) {
			if(item != null) {
				System.out.printf("%-30s%10.2f%5d\n", item.getTitle(), item.getPrice(), 
						item.getQuantity());
				counter1++;
				counter2 += (item.getPrice()*item.getQuantity());
			}
		}
		
		System.out.printf("%-30s%10s%5s\n", "", counter1, counter2);
	}
}

