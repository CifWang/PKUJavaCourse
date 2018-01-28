package primeNumberTest;
/**
 * 
 * @author peer1
 *
 */
public class prime {

	public static void main(String[] args) {
		int[] original = new int[9999];

		for (int i = 0; i < original.length; i++) {
			original[i] = i + 2;
		} // 初始化

		for (int i = 0; i < (int) (Math.sqrt(10000) + 2); i++) { // 不必全部遍历，开根即可
			for (int j = 0; j < original.length; j++) {
				if ((original[i] != 0) && (original[j] != original[i]) && (original[j] % original[i] == 0))
					original[j] = 0;
			}
		}

		int[] out = new int[9999];
		int count = 0;

		for (int i = 0; i < original.length; i++) {
			if (original[i] != 0) {
				out[count++] = original[i];
			}
		} // 数组传递

		System.out.println("总数字是" + count);// 数目输出

		int counter = 1;
		for (int i : out) {
			if (i != 0)
				System.out.print(i + " ");
			if (((counter++) % 5 == 0) && (i != 0))
				System.out.println();
		} // 数组输出

		System.out.println();
		System.out.println("总数字是" + count);// 数目输出

	}
}
