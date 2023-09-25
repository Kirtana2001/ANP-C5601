//1 2 3 4 5 6
//1 2 3 4 5
//1 2 3 4
//1 2 3
//1 2
//1
public class Pattern2 {
	public static void main(String[] args) {
		int row = 6;
		int num=1;
		for (int i = 6; i>=1; i--) {
			for (int j = 0; j<i; j++) {

				System.out.print(num+j+" ");
			}
			System.out.println();
		}
	}
}
