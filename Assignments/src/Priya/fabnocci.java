package Priya;

import java.util.Scanner;

public class fabnocci {

	public static void main(String[] args) {
		int a=0,b=1,c;
		System.out.println("upto");
		Scanner s=new Scanner(System.in);
		c=s.nextInt();
		 
		while (a<=c) {System.out.print(a + " ");
		int sum = a+b;
		a = b;
		b=sum;
		
					

}}}