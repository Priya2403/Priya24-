package Handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.Spring;

public class File_handling_same_line {
	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\Priya\\Desktop\\File_handling.txt"); //Connection establishment
		FileReader fr=new FileReader(f); //Read char by char from File
		BufferedReader b=new BufferedReader(fr); //Read line by line
		String s;
		
		while((s=b.readLine())!=null) 
		
		{System.out.println(s);
		
	}}
}
