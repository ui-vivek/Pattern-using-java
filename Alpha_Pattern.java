package CodingNinja1.Pattern;

import java.util.Scanner;
public class Alpha_Pattern {


		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int input = s.nextInt();
			int i=1;
			
			while(i<=input) {
				
				int j=1;
				while(j<=i) {
					char Alfa=(char)('A'+i-1);
					System.out.print(Alfa);
					j=j+1;
				}
				System.out.println();
				i=i+1;

		}
			s.close();
	//end
	}
}