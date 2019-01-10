package Priya;

import java.util.Scanner;

public class Prime_between2_num {
	public static void main(String[] args) {
		int number;
		System.out.println("Enter the number from");
		Scanner s=new Scanner(System.in);
		number=s.nextInt();
		int end;
		System.out.println("Enter the number till");
		Scanner s1=new Scanner(System.in);
		end=s.nextInt();
		int half=number/2;
		int v=0;
		
		for(number=1;number<=end;number++)
			{
			for(int i=2;i<=half;i++)
			
		{
			if(number%i==0)
			{
				System.out.println("This is not a Prime Number"+ number);
				v=1;
				break;
			}
		}
		if(v==0)
		{
		System.out.println("This is Prime Number"+ number);	
		
		}
}
}
}