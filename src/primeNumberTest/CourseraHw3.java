package primeNumberTest;
/**
 * 
 * @author peer2
 *
 */


public class CourseraHw3 {
	static int [] a=new int [10001];
public static void main(String[] args) {
	initial(a);//Initialize the array,a[]={0,1,2,3,4,5,......}
	a[1]=0;//drop 1;
	for(int i=2;i<=5000;i++) {
		delete(i);//drop the numbers which is equal to multiple of i
	}
	printNonzeroNumbers(a);//Print the numbers that is not equal zero in the array
}

static void initial(int [] a) {
	for(int i=0;i<a.length;i++) {
		a[i]=i;
	}
}

static void delete(int n) {
	for(int i=2;true;i++) {
		if(i*n<=10000)
			a[i*n]=0;
		else break;
	}
}

static void printNonzeroNumbers(int [] a) {
	for(int x:a) {
		if(x!=0)
			System.out.println(x);
	}
}
}