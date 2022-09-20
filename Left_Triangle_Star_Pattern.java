package CodingNinja1.Pattern;
import java.util.Scanner;
public class Left_Triangle_Star_Pattern {


		public static void main(String[] args) {
			Scanner s=new Scanner (System.in);
			int input=s.nextInt();
			
			int i=1;
			while(i<=input) {
				
				int space=1;
				while(space<=input-i) {
					System.out.print(" ");
					space++;
				}
				
				int star=1;
				while(star<=i) {
					System.out.print("*");
					star=star+1;
					
				}
				System.out.println();
				i++;
			}
	s.close();
		}

	}
