package CodingNinja1.Pattern;
import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// start
	
	  Scanner s=new Scanner (System.in);
	        int input=s.nextInt();
        
        int i=1;
        while(i<=input){
        	
	            int j=1;
	            int p=input;
	            while(j<=input){
	                if(p==i) {
	                	System.out.print("*");
                	 p--;
 	                j++;
                	continue;
               }
	                System.out.print(p);
                p--;
	                j++;
            }
          System.out.println();
          i++;
       }
//end	
        s.close();
}
}

