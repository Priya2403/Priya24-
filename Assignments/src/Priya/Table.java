package Priya;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		int a,num;
		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		
		for (a=1;a<=10;a++)
		{ System.out.println(num+"*"+a+"="+num*a);
		}
		}
}
