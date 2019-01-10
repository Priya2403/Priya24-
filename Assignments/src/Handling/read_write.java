package Handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class read_write {
public static void main(String[] args) throws IOException {
	File f1=new File("C:\\Users\\Priya\\Desktop\\File_handling.txt");
	File f3=new File("C:\\Users\\Priya\\Desktop\\File_handling3.txt");
	
	FileReader fr=new FileReader(f1);
	BufferedReader br=new BufferedReader(fr);
	
	FileWriter fr1=new FileWriter(f3,true);
	BufferedWriter br2=new BufferedWriter(fr1);
	
	String s;
	while ((s=br.readLine())!=null)
	{
		br2.write(s);
		br2.newLine();
		
}
	br2.close();
}}
