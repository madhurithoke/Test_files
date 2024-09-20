package setB;

import java.util.Scanner;
public class ExceptionHandling {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the age: ");
		int age=s.nextInt();
		System.out.println("Enter the weight: ");
		int wt=s.nextInt();
		try {
		if(age>=20 && age<=60)
		{
			System.out.println("Age is valid:"+age);
		}else
		{
			System.out.println("Age is Invalid:"+age);
		}
		if(wt>=40 && wt<=70) {
			System.out.println("wt is valid:"+wt);
		}else {
			System.out.println("wt is Invalid:"+wt);
			}
		
		}catch(Exception e) {
			System.out.println("Invalid inputs: "+e);
			
		}
       
	}

}
