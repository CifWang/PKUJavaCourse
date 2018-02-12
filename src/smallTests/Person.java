package smallTests;
/**
 * 
 * @author cifengwang
 *
 */

public class Person {
	//step2
	String name="未命名";
	int age=-1;
	Person(String name,int age){
		super();//step1
		//step3
		System.out.println("开始构造Person(),此时this.name="+this.name);
		this.name=name;
		this.age=age;
		System.out.println("Person()构造完成，此时this.name="+this.name);
	}

}
