package Handling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Append {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Priya\\Desktop\\File_handling2.txt"); //Connection establishment
		FileWriter fw=new FileWriter(f,true);
		BufferedWriter b=new BufferedWriter(fw); //For new line
		b.newLine();
		b.write("Updated - My name is Priya");	
		b.newLine();
		b.write("Updated - My name is Priya Kunwar");
		b.close();
}
}