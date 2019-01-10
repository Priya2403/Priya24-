package JXL_handling;


import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Write {
public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
	File f=new File("C:\\Users\\Priya\\Desktop\\JXL\\EXCEL_2.xls"); //Connection establishment
	WritableWorkbook wk=Workbook.createWorkbook(f);
	WritableSheet ws=wk.createSheet("Priya", 0);
	
	for (int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			Label a=new Label(j,i,"Priya");
			ws.addCell(a);
		}
	}
	wk.write(); // for saving
	wk.close(); // for closing
}
}

