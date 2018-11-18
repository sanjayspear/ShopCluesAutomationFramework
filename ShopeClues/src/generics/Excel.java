package generics;

import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel implements IAutoConst{
	
	public static String getCellValue(String xlPath, String sheet,int row, int cell )
	{
		String v="";
		try
		{
			FileInputStream f= new FileInputStream(xlPath);
			Workbook w= WorkbookFactory.create(f);
			v=w.getSheet(sheet).getRow(row).getCell(cell).toString();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return v;
	}
public static int rowCount(String xlPath, String sheet)
{
	int rc= 0;
	try
	{
		FileInputStream f = new FileInputStream(xlPath);
		Workbook w = WorkbookFactory.create(f);
		rc= w.getSheet(sheet).getLastRowNum();
	}
	catch (Exception e) {
		// TODO: handle exception
	}
	return rc;
}
}
