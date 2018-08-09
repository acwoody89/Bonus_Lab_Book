import java.util.ArrayList;
import java.util.Scanner;

public class BookApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		ArrayList<Book> bookList1 = new ArrayList<>();
		ArrayList<Book> bookList2 = new ArrayList<>();

//		int count = Validator.getInt(scan, "How many books would you like to Ender? Get it? Aww, stop Wiggin out...");

//		while(count > 0) {
//			String BookNum = Validator.getString(scan, "Enter The ISBN 13 Digit Number: ");
//			String bookTitle = Validator.getString(scan, "Enter Book Title: ");
//			String bookAuth = Validator.getString(scan, "Enter Book Author: ");
//			double bookPrice = Validator.getDouble(scan, "Enter book price: ", 0.01, 1000.00);
//			
//			Book addBook = new Book(BookNum, bookTitle, bookAuth, bookPrice);
//			bookList1.add(addBook);
//			
//			count--;
//		}
//		
//		printMenu(bookList1);

		Book b1 = new Book("9780451463", "Changes", "Jim Butcher", 9.99);
		Book b2 = new Book("978-1500506", "Nice Dragons Finish Last", "Rachael Aaron", 13.99);
		Book b3 = new Book("978-0062572", "American Gods", "Neil Gaiman", 15.56);
		bookList2.add(b1);
		bookList2.add(b2);
		bookList2.add(b3);

		Book ub4 = new UsedBook("9780552137", "Damia", "Anne McCaffrey", 1.22, "Good");
		Book ub5 = new UsedBook("9780547722", "A Wizard of EarthSea", "Ursula K. Le Guin", 6.09, "Acceptable");
		Book ub6 = new UsedBook("9780765300", "Wizard's First Rule", "Terry Goodkind", 8.09, "Like New");
		Book ub7 = new UsedBook("97807653424", "Ender's Shadow", "Orson Scott Card", 8.98, "Very Good");
		bookList2.add(ub4);
		bookList2.add(ub5);
		bookList2.add(ub6);
		bookList2.add(ub7);
		selectBook(scan, bookList2);

	}

	public static void printMenu(ArrayList<Book> bookList1) {
		System.out.println();
		System.out.println(String.format("%-20s %-25s %-30s %-15s", "ISBN", "Title", "Author", "Price"));
		System.out.println(String.format("%-20s %-25s %-30s %-15s", "*****", "*****", "*****", "*****"));
		for (Book b : bookList1) {
			System.out.println(b.toString());
		}
	}

	public static void printMenu2(ArrayList<Book> bookList2) {

		System.out.println(String.format("%-20s %-20s %-25s %-30s %-15s %-15s", 
									"Option", "ISBN", "Title", "Author", "Price", "Condition"));
		System.out.println(String.format("%-20s %-20s %-25s %-30s %-15s %-15s",
									"*****", "*****", "*****", "*****", "*****", "*********"));
		int count = 1;
		for (Book b : bookList2) {

			
			System.out.print(String.format("Option: %-10s", count));
			System.out.println(b.toString());
			count++;
			
			
//			if(b instanceof UsedBook) {
//			System.out.print(String.format("Option: %-10s", count));
//			System.out.println(b.toString());
//			count++;
//			}
		}
		System.out.println("Enter 0 to Exit");
		System.out.println();

	}

	public static void selectBook(Scanner scan, ArrayList<Book> bookList2) {
		int input = 1;
			do {
				System.out.println();
				printMenu2(bookList2);
				input = Validator.getInt(scan, "What Book?", 0, 7);
				if (input != 0) {

					System.out.println();
					
					printMenu2(bookList2);
//					System.out.println(String.format("%-20s %-20s %-25s %-27s %-15s %-15s", "Option", "ISBN", "Title",
//							"Author", "Price", "Condition"));
//					System.out.println(String.format("%-20s %-20s %-25s %-27s %-15s %-15s", "*****", "*****", "*****",
//							"*****", "*****", "*********"));
//					System.out.println(bookList2.get(input - 1).toString());
					System.out.println();

					int purchNum = Validator.getInt(scan,
							"Would you like to purchase this book?" + " (1) = yes || (2) = no", 1, 2);
					if (purchNum == 1) {
						System.out.println();
						System.out.println("You purchased " + bookList2.get(input - 1).getBookTitle());
						bookList2.remove(input - 1);
					}
				}
//		input = Validator.getDouble(scan, "(0) Quit, " + "" 
			} while (input != 0 && bookList2.size() > 0);
			if(bookList2.size() == 0) {
				System.out.println("You BOUGHT All of the Books.");
			}
	}
}
