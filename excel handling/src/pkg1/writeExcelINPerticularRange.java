package pkg1;
//WRITE DATA IN EXCEL TILL ROW COUNT AND COLUMN COUNT
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class writeExcelINPerticularRange
{
	public void writeinrange(int row,int column) throws IOException, RowsExceededException, WriteException
	{
		File f=new File("C:\\Users\\admin\\Desktop\\file3.xls");
		WritableWorkbook wk=Workbook.createWorkbook(f);
		WritableSheet ws=wk.createSheet("mysheet",0);
		System.out.println("enter data");;
		Scanner s=new Scanner(System.in);
		String data;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				data=s.next();
				Label l=new Label(j,i,data);
				ws.addCell(l);
			}
		}
		wk.write();
		wk.close();
		
	}
	public static void main(String[] args) throws RowsExceededException, WriteException, IOException 
	{
		writeExcelINPerticularRange obj=new writeExcelINPerticularRange();
		obj.writeinrange(2,3);
	}

}
