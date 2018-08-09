
public class UsedBook extends Book {

	public UsedBook(String bookNum, String bookAuth, String bookTitle, double bookPrice) {
		super(bookNum, bookAuth, bookTitle, bookPrice);

	}

	private String bookCond;

	public UsedBook(String bookNum, String bookAuth, String bookTitle, double bookPrice, String bookCond) {
		super(bookNum, bookAuth, bookTitle, bookPrice);
		this.bookCond = bookCond;
	}
	
	public void setBookCond(String bookCond) {
		this.bookCond = bookCond;
	}
	
	public String getBookCond() {
		return this.bookCond;
	}

	@Override
	public String toString() {

		return super.toString() + String.format("%-15s", bookCond);

	}
}
