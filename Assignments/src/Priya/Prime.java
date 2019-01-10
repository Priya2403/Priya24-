package Priya;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		int a;
		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		
		if ( (a==2) || (a==3))
		{
			System.out.println("Number is Prime");
					
	}
		else if ((a%2==0) || (a%3==0))
	
	{
		System.out.println("Number is not Prime");
}
	else 
	{
	System.out.println("Number is Prime");
}
}
}
