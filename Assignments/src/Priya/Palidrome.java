package Priya;

import java.util.Scanner;

public class Palidrome {
	public static void main(String[] args) {
		int a,sum=0,r;
		
		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		int a1=a;
		
		while (a>0)
		{
			r = a%10;
			sum= sum*10+r;
			a=a/10;
		}
		if (sum==a1)
		{System.out.println("Number is palidrome");
		}
		else
		{System.out.println("Number is not palidrome");	
				
					}
	}

}
