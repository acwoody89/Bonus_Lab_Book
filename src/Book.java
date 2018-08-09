
public class Book {
	private String bookNum;
	private String bookAuth;
	private String bookTitle;
	private double bookPrice;
	
	public Book() {
		bookNum = "0000000000000";
		bookAuth = "Anon Y. Mous";
		bookTitle = "Who Am I...";
		bookPrice = 6.66;
		
	}
	
	public Book(String bookNum, String bookTitle, String bookAuth, double bookPrice) {
		this.bookNum = bookNum;
		this.bookTitle = bookTitle;
		this.bookAuth = bookAuth;
		this.bookPrice = bookPrice;
	}
	
	public void setBookNum(String bookNum) {
		this.bookNum = bookNum;
	}
	
	public String getBookNum() {
		return bookNum;
	}
	
	public void setBookAuth(String bookAuth) {
		this.bookAuth = bookAuth;
	}
	
	public String getBookAuth() {
		return this.bookAuth;
	}
	
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	
	public String getBookTitle() {
		return this.bookTitle;
	}
	
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	public double getBookPrice() {
		return this.bookPrice;
	}
	
	public String toString() {
		return String.format("%-20s %-25s %-33s $%-15.2f", bookNum, bookTitle, bookAuth, bookPrice);
	}
	
	
	
}