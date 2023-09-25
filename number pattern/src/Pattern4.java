//3 4
//4 5 6
public class Pattern4 {
	public static void main(String[] args) {
		int row=2;
		int num=3;
		for (int i=1;i<=row;i++)
		{
			for (int j = 0; j <=i; j++) {
				System.out.print(num +j+ " ");
			}
			System.out.println();
			num++;
		}
	}
}
