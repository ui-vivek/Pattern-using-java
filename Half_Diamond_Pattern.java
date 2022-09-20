package CodingNinja1.Pattern;
import java.util.Scanner;
public class Half_Diamond_Pattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		int i=1;
		while(i<=input+1) {
			System.out.print("*");
			
			int j=1;
			while(j<=i-1) {
				System.out.print(j);
				j++;
			}
				int k=i-2;
				while(k>=1) {
					System.out.print(k);
					k--;
				
			}
				int star=i-1;
				while(star>0) {
					
					System.out.print("*");
					break;
				} 
			System.out.println();
			i=i+1;
			
		}
        int i2=1;
		if(input == 0){
            i2-=1;
        }
		
		while(i2<=input) {
			System.out.print("*");
			
			int j=1;
			while(j<=input-i2) {
				System.out.print(j);
				j++;
			}
			int k=input-i2-1;
			while(k>=1){
				System.out.print(k);
				k--;
			}
			
			int star=input-i2;
			while(star>=1) {
				
				System.out.print("*");
				break;
			}
		
			System.out.println();
			i2++;
		}
//end
		s.close();
}
}