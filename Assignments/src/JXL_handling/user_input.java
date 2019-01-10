package JXL_handling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class user_input {
public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
	File f=new File("C:\\Users\\Priya\\Desktop\\JXL\\EXCEL_4.xls"); //Connection establishment
	
	System.out.println("Enter the text");
	Scanner s=new Scanner(System.in);
	
	
	WritableWorkbook wk=Workbook.createWorkbook(f);
	WritableSheet ws=wk.createSheet("Priya", 0);
	
	for (int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
		{
			String s1=s.nextLine();
			Label a=new Label(j,i,s1);
			ws.addCell(a);
		}
	}
	wk.write(); // for saving
	wk.close(); // for closing
}
}
