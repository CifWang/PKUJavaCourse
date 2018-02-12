package library;
/**
 * 
 * @author cifengwang
 *
 */

public class Books {
	//书的id,书的title，书的author,书的price和一个布尔变量，标记书是否被借出去了，初始值为false
	private int id;
	private String title;
	private String author;
	private float price;
	private boolean ifBorrowed;
	public Books(int id, String title, String author, float price, boolean ifBorrowed) {
		this.id=id;
		this.title=title;
		this.author=author;
		this.price=price;
		this.ifBorrowed=ifBorrowed;
	}
	public int getId() {
		return this.id;
	}
	public String getTitle() {
		return this.title;
	}
	public String getAuthor() {
		return this.author;
	}
	public float getPrice() {
		return this.price;
	}
	public boolean getIfBorrowed() {
		return this.ifBorrowed;
	}
	public void  setIfBorrowed(boolean borrow) {
		this.ifBorrowed=borrow;
	}
}
