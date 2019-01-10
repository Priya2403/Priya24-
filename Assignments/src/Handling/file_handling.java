package Handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class file_handling {
	
	public static void main(String[] args) throws IOException {
		
	File f=new File("C:\\Users\\Priya\\Desktop\\File_handling.txt"); //Connection establishment
	FileReader fr=new FileReader(f); //Read from File
	int a;
	
	while((a=fr.read())!=-1) 
	
	{
		System.out.println((char)a);
	
	
}
	}}
