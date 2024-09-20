package setB;

import java.util.Scanner;
public class SumOfDigits {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=s.nextInt();
		int digit=0;
		int i;
		 if(num!=0){

		for(i=0;i<=num;i++  )
			 if(i%2==0)
			 {
				 digit+=i;
				System.out.println("Sum of even Digits: "+digit);
				  digit/=10;
					
			 }
		   else{
			   digit/=10;
				 digit+=i;
				System.out.println("Sum of odd Digits: "+digit);
				
		       }
		
		
	    }
		

		
	}

}
