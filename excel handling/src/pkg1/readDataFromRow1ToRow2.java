package pkg1;
//READ DATA FROM ROW1 TO ROW2
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class readDataFromRow1ToRow2 
{
	public void readdataofrow(int row1,int row2) throws BiffException, IOException
	{
		File f=new File("C:\\Users\\admin\\Desktop\\file1.xls");
		Workbook wk=Workbook.getWorkbook(f);
		Sheet ws=wk.getSheet(0);
		//row1=ws.getRows();
		//row2=ws.getRows();
		int c1=ws.getColumns();
		for(int i=0;i<row2;i++)
		{
			if((i>=row1)&(i<=row2))
			{
				for(int j=0;j<c1;j++)
			{
				Cell c=ws.getCell(j,i);
				System.out.println(c.getContents());
			}
			}
		}
	}
	public static void main(String[] args) throws BiffException, IOException 
	{
		readDataFromRow1ToRow2 obj=new readDataFromRow1ToRow2();
		Scanner s=new Scanner(System.in);
		 System.out.println("ENTER ROW ");
		 int r=s.nextInt();
		 int r1=s.nextInt();
		obj.readdataofrow(r,r1);
		
	}

}
