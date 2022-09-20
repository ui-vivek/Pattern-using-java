package CodingNinja1.Pattern;

import java.util.Scanner;
public class Odd_Square {
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int input = s.nextInt();
			int i=1;
			while(i<=input) {
				int j=i*2-1;
				while(j<=input*2-1) {
					System.out.print(j);
					j+=2;
				}
					int k=1;
					while(k<=(i-1)*2-1) {
						System.out.print(k);
						k=k+2;
					}
				System.out.println();
				i++;
			}
	//end
			s.close();
	}
	}