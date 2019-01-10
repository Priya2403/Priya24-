package JXL_handling;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Read {
public static void main(String[] args) throws BiffException, IOException {
	File f=new File("C:\\Users\\Priya\\Desktop\\JXL\\EXCEL_1.xls"); //Connection establishment
	Workbook wk=Workbook.getWorkbook(f);
	Sheet ws=wk.getSheet(0);
	int r=ws.getRows();
	int c=ws.getColumns();
	
	for (int i=0;i<r;i++)
	{
		for (int j=0;j<c;j++)
		{
			Cell c1=ws.getCell(j,i); //Sheet object
			System.out.println(c1.getContents());
		}
	}
}
}
