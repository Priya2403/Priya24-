package Priya;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int a,b=1,num;
		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		
		
		for (a=1;a<=num;a++)
			b = b*a;
		
		
		{
			System.out.println("Factorial is" + b );
		}
		
		
}
}