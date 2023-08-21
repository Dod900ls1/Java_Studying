package Store;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;

public class BookExcerciser {


	
	public static List<Book> readBooksFromFile(String name){
		List<Book> books = null;
		
		try (FileInputStream input = new FileInputStream(name);
			InputStreamReader stream = new InputStreamReader(input);
			LineNumberReader lineReader = new LineNumberReader(stream)){
			books = new ArrayList<>();
			String line;
			while((line = lineReader.readLine()) != null) {
				System.out.printf("%d, %s%n", lineReader.getLineNumber(), line);
				String title = line;
				String author = lineReader.readLine();
				double price = Double.parseDouble(lineReader.readLine());
				System.out.printf("Book: [Title %s, Author: %s, Price: $%.2f%n]", title, author, price);
				books.add(new Book(title, price, 5, author, null, "NON-FICTION"));
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		return books;
	}

	public static void main(String[] args) {
		String location = "C:\\Users\\38097\\OneDrive\\Рабочий стол\\Java_Study\\JavaClassLibrary\\Store\\Book.txt";
		List<Book> books = readBooksFromFile(location);
		
		for(Book book: books) {
			System.out.println(book.getTitle());
		}
	}

}
