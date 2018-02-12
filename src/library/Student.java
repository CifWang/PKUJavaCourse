package library;
/**
 * 
 * @author cifengwang
 *
 */
import java.io.*;
import java.util.Scanner;

public class Student extends Person implements borrowAndreturn{
	private String name;
	@Override
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	@Override
	public void borrowBook(String title) {
		//要借什么书，用户输入title，假如有这本书且书没有被借出去，显示成功借到书，并且把这本书的ifBorrowed参数改为true
		//假如书被借出去了，也即这本书的ifBorrowed是true，那么显示这本书已经被借走了
		//假如没有这本书，显示图书馆中没有这本书
		for(Books item:Library) {
			if(item.getTitle().equals(title)&&!item.getIfBorrowed()) {
				item.setIfBorrowed(true);
				System.out.println("You've borrowed "+" "+item.getTitle());
				return;
			}
			else if(item.getTitle().equals(title)&&item.getIfBorrowed()) {
				System.out.println("This book has been borrowed");
				return;
			}
			else {
				System.out.println("No such book in the library.");
				return;
			}
		}
	}
	@Override
	public void borrowBook(int id) {
		//要借什么书，用户输入id，假如有这本书且书没有被借出去，显示成功借到书，并且把这本书的ifBorrowed参数改为true
		//假如书被借出去了，也即这本书的ifBorrowed是true，那么显示这本书已经被借走了
		//假如没有这本书，显示图书馆中没有这本书
		for(Books item:Library) {
			if(item.getId()==id&&!item.getIfBorrowed()) {
				item.setIfBorrowed(true);
				System.out.println("You've borrowed "+" "+item.getTitle());
				return;
			}
			else if(item.getId()==id&&item.getIfBorrowed()) {
				System.out.println("This book has been borrowed.");
				return;
			}
			else {
				System.out.println("No such book in the library.");
				return;
			}
		}
	}
	@Override
	public void returnBook(String title) {
		//还书，用户输入title，一切正常，成功还书。
		//假如图书馆中原本没有这本书或这本书没有借出去，显示错误！
		for(Books item:Library) {
			if(item.getTitle().equals(title)&&!item.getIfBorrowed()) {
				System.out.println("Error!");
				return;
			}
			else if(item.getTitle().equals(title)&&item.getIfBorrowed()) {
				item.setIfBorrowed(false);
				System.out.println(" "+item.getTitle()+" has been returned, thank you!");
				return;
			}
			else {System.out.println("Error!");}
			return;
		}
	}
	@Override
	public void returnBook(int id) {
		//还书，用户输入id，一切正常，成功还书。
		//假如图书馆中原本没有这本书或这本书没有借出去，显示错误！
		for(Books item:Library) {
			if(item.getId()==id&&!item.getIfBorrowed()) {
				System.out.println("Error!");
			}
			else if(item.getId()==id&&item.getIfBorrowed()) {
				item.setIfBorrowed(false);
				System.out.println(" "+item.getTitle()+" has been returned, thank you!");
			}
			else {System.out.println("Error!");}
		}
	}
	public static void main(String[] args) {
		Student s=new Student();
		Scanner input1=new Scanner(System.in);
		System.out.println("Enter your name:");
		s.setName(input1.next());
		Scanner input2=new Scanner(System.in);
		System.out.println("Which book would you borrow? Enter book id or book title:");
		String titleBorrowed=input2.nextLine();
		s.borrowBook(titleBorrowed);
		//int idBorrowed=input2.nextInt();
		//s.borrowBook(idBorrowed);
		System.out.println(s.getName());
		System.out.println(book1.getTitle());
		System.out.println(book1.getIfBorrowed());
	}
	
}

