package CodingNinja1.Pattern;
import java.util.Scanner;

public class Sum_Pattern {

		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int input = s.nextInt();
			int i=1;
			int sum=0;
			
			while(i<=input) {
				int j=1;
				while(j<=i) {
					System.out.print(j);
					sum=sum+j;
					
					int pluse=i-1;
					while(pluse>j-1) {
						System.out.print("+");
						break;
					}
//					int eq=i-j;
//					while(eq==0) {
//						System.out.print("="+sum);
//						break;
//					}
					j++;
//					System.out.print(sum);
				}
				System.out.print("="+sum);
				sum=0;
				System.out.println();
				i=i+1;
			}
			
			
s.close();
	//end
	}
	}