package primeNumberTest;
import java.util.*;

/**
 * 
 * @author cifengwang
 *
 */
public class PrimeNum {
	//Feel free to change the range of the numbers
	private static int[] range=new int[9999];
	//Beginning number of the numbers
	private static int Count=2;
	//Store the prime numbers
	private static List<Integer> primeNum=new ArrayList();
	
	public static void main(String[] args) {
		for(int i=0;i<range.length;i++) {
			range[i]=Count;
			Count++;
		}
		
		for(int num:range) {
			if(primenum(num)) {
				primeNum.add(num);
			}
		}
		for(int item:primeNum) {
			System.out.print(item+" ");
		}
	}
	
	/**
	 * Check if the input number is a prime number
	 * @param number
	 * @return true if it is a prime number, false otherwise
	 */
	public static boolean primenum(int number) {
		for(int i=2;i<number;i++) {
			int c=number%i;
			if(c==0) {
				return false;
			}
		}
		return true;
	}


}
