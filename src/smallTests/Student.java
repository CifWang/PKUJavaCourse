package smallTests;
/**
 * 
 * @author cifengwang
 *
 */

public class Student extends Person {
	String school="未定学校";//step2
	Student(String name, int age, String school){
		super(name,age);//step1
		//step3
		System.out.println("开始构造Student()，此时this.name="+this.name);
		this.school=school;
		System.out.println("Student()构造完成，此时this.name="+this.name);
	}
	public static void main(String[] args) {
		Student s=new Student("liming",15,"未定");
	}

}
