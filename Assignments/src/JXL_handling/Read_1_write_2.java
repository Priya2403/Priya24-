package JXL_handling;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Read_1_write_2 {
        public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException {
        	File f1=new File("C:\\Users\\Priya\\Desktop\\JXL\\EXCEL_1.xls");
        	File f3=new File("C:\\Users\\Priya\\Desktop\\JXL\\EXCEL_3.xls");
        	
        	Workbook wk1=Workbook.getWorkbook(f1); //Read
        	Sheet ws=wk1.getSheet(0);
        	int r=ws.getRows();
        	int c=ws.getColumns();
        	
        	
        	WritableWorkbook wk3=Workbook.createWorkbook(f3);
        	WritableSheet ws3=wk3.createSheet("Priya", 0);
        	
        	for (int i=0;i<r;i++)
        	{
        		for(int j=0;j<c;j++)
        		{
        			Cell c1=ws.getCell(j,i);
        			Label a=new Label(j,i,c1.getContents());
        			ws3.addCell(a);
        		}
        	}
        	wk3.write(); // for saving
        	wk3.close(); // for closing
        			}
}
