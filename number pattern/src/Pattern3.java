//    5
//   4 5
//  3 4 5
// 2 3 4 5
//1 2 3 4 5
public class Pattern3 {
	public static void main(String[] args) {
		int row=5,num=1;
		for(int i=5;i>=1;i--){
			for(int j=1;j<=5;j++) {
				if(j<=i-1)
				System.out.print(" ");
				else
					System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
