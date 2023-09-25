//1 2 3 4
//1 2
public class Pattern5 {
	public static void main(String[] args) {
		for(int i=0;i<=1;i++){
			for (int j=1;j<=4;j++){

				if(i==1 && j==1){
					System.out.print(1+" "+2);
					break;
				}
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
