package Priya;

import java.util.Scanner;

public class Swapping1 
{
	public static void main(String[] args) 
	{
	 int a,b,c;
	 System.out.println("Please enter value of a");
	Scanner s =new Scanner(System.in);
	 a=s.nextInt();
	 
	 System.out.println("Please enter value of b");
			 Scanner s1 =new Scanner(System.in);
			 b=s1.nextInt();
	c=a;
	a=b;
	b=c;
System.out.println("a after swaping" + a);
System.out.println("b after swaping" + b);

}
}
