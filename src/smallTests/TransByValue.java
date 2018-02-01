package smallTests;
/**
 * 
 * @author cifengwang
 *
 */

public class TransByValue {
	public static void main(String[] args) {
		int a=0;
		modify(a);
		System.out.println(a);
		
		int[] b=new int[1];
		modify(b);
		System.out.println(b[0]);
		System.out.println(b.length);
	}
	public static void modify(int a) {//a没有传回去
		a++;
	}
	public static void modify(int[] b) {
		b[0]++;
		b=new int[5];//调用者的引用并没有发生改变
	}
}


