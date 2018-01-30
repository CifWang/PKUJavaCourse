package HanoiTowerTest;
/**
 * 
 * @author cifengwang
 *
 */
public class HanoiTowerTest {
	public static void HanoiTowerMove(int n, char from, char to, char middle) {
		if(n==1) {
			System.out.println(from+" to "+to);
		}
		else {
			HanoiTowerMove(n-1,from,middle,to);
			System.out.println(from+" to "+to);
			HanoiTowerMove(n-1,middle,to,from);
		}
	}
	public static void main(String[] args) {
		HanoiTowerMove(3,'a','b','c');
	}

}
