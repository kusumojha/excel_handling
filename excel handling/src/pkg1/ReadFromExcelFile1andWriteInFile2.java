package pkg1;
//READ FROM EXCEL FILE1 AND WRITE IN EXCEL FILE2 IN XLA FORMAT
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

public class ReadFromExcelFile1andWriteInFile2 
{
	public static void main(String[] args) throws BiffException, IOException, WriteException 
	{
		File f1=new File("C:\\Users\\admin\\Desktop\\file1.xls");
		Workbook wk1=Workbook.getWorkbook(f1);
		Sheet ws=wk1.getSheet(0);	
		File f2=new File("C:\\Users\\admin\\Desktop\\file4.xls");
		WritableWorkbook wk2=Workbook.createWorkbook(f2);
		WritableSheet ws1=wk2.createSheet("mysheet",0);	
		int r=ws.getRows();
		int c=ws.getColumns();
		String s = null;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				Cell c1=ws.getCell(j,i);
				s=c1.getContents();
			 Label l=new Label(j,i,s);
			 ws1.addCell(l);
			}
		}
		
		wk2.write();
		wk2.close();
		
		
		
		
	}

}
