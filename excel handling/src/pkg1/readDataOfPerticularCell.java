package pkg1;
//READ DATA OF PERTICULAR CELL
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class readDataOfPerticularCell 
{
	public void readdataofcell(int row,int column) throws BiffException, IOException
	{
		File f=new File("C:\\Users\\admin\\Desktop\\file1.xls");
		Workbook wk=Workbook.getWorkbook(f);
		Sheet ws=wk.getSheet(0);
		Cell c=ws.getCell(column, row);
		System.out.println(c.getContents());
		
	}
 public static void main(String[] args) throws BiffException, IOException
{
	 readDataOfPerticularCell obj=new readDataOfPerticularCell();
	 Scanner s=new Scanner(System.in);
	 System.out.println("ENTER ROW AND COLUMN OF WHICH YOU WANT TO RETRIVE THE VALUE");
	 int r=s.nextInt();
	 int c=s.nextInt();
	 obj.readdataofcell(r, c);
	
}
}
