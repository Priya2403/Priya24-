package Priya;

import java.util.Scanner;

public class Prime_approach_2 {
public static void main(String[] args) {
	int number;
	System.out.println("Enter the number");
	Scanner s=new Scanner(System.in);
	number=s.nextInt();
	int half=number/2;
	int v=0;
	
	for(int i=2;i<=half;i++)
	{
		if(number%i==0)
		{
			System.out.println("This is not a Prime Number");
			v=1;
			break;
		}
	}
	if(v==0)
	{
	System.out.println("This is Prime Number");	
	}
	}
}

