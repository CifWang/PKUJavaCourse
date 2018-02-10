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
		for(Books item:Library) {
			if(item.getTitle()==title&&!item.getIfBorrowed()) {
				item.setIfBorrowed(true);
				System.out.println("You've borrowed "+" "+item.getTitle());
			}
			else if(item.getTitle()==title&&item.getIfBorrowed()) {
				System.out.println("This book has been borrowed");
			}
			else {
				System.out.println("No such book in the library.");
			}
		}
	}
	@Override
	public void borrowBook(int id) {
		for(Books item:Library) {
			if(item.getId()==id&&!item.getIfBorrowed()) {
				item.setIfBorrowed(true);
				System.out.println("You've borrowed "+" "+item.getTitle());
			}
			else if(item.getId()==id&&item.getIfBorrowed()) {
				System.out.println("This book has been borrowed.");
			}
			else {
				System.out.println("No such book in the library.");
			}
		}
	}
	@Override
	public void returnBook(String title) {
		for(Books item:Library) {
			if(item.getTitle()==title&&!item.getIfBorrowed()) {
				System.out.println("Error!");
			}
			else if(item.getTitle()==title&&item.getIfBorrowed()) {
				item.setIfBorrowed(false);
				System.out.println(" "+item.getTitle()+" has been returned, thank you!");
			}
			else {System.out.println("Error!");}
		}
	}
	@Override
	public void returnBook(int id) {
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
		int idBorrowed=input2.nextInt();
		s.borrowBook(idBorrowed);
		System.out.println(s.getName());
		System.out.println(book1.getTitle());
		System.out.println(book1.getIfBorrowed());
	}
	
}

