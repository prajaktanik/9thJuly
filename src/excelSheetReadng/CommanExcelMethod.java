package excelSheetReadng;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
sss
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class CommanExcelMethod 
{
	static File myFile;
	static Sheet mySheet;

public static void main(String[] args) throws IOException, EncryptedDocumentException
{
	

	myFile= new File("D:\\selenium\\Excel.xlsx");
	
	mySheet= WorkbookFactory.create(myFile).getSheet("Sheet2");
	
	
}
	public static String readDataFromExcel(int row, int cell)
	{
		String value = mySheet.getRow(row).getCell(cell).getStringCellValue();
		return value;
		
	}
	
	
}
