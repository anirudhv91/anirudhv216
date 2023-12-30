package genericlibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fileutility {
	public static String getproperty(String key) {
FileInputStream fis = null;
try {
	fis = new FileInputStream("./src/test/resources/commondata.properties");
} catch (Exception e) {
// TODO: handle exception
	e.printStackTrace();
}
Properties p = new Properties();
try {
	p.load(fis);
} catch (Exception e) {
	e.printStackTrace();
	// TODO: handle exception
}
return p.getProperty(key);
	}
	
	//  public static void readcellDataFromExcel(String sheet, int row, int cell) throws EncryptedDocumentException, IOException {
//      FileInputStream excel = new FileInputStream("./resources/testcase2.xlsx");
//		Workbook book = WorkbookFactory.create(excel);
//		Sheet sheet = book.getSheet("Sheet1");
//		Row row = sheet.getRow(3);
//		System.out.println(row.getCell(4));
	//	System.out.println(WorkbookFactory.create(excel).getSheet(sheet).getRow(row).getCell(cell));
//	}
	public static String[][] readrowdatafromexcel(String sheetname) throws EncryptedDocumentException, IOException {
		FileInputStream excel = new FileInputStream("./resources/testcase2.xlsx");
		Workbook book = WorkbookFactory.create(excel);
		Sheet sheet = book.getSheet(sheetname);
		int rowcount = sheet.getPhysicalNumberOfRows();
		int cellcount = sheet.getRow(0).getPhysicalNumberOfCells();
		String[][] data = new String[rowcount-1][cellcount];
		for (int i = 1; i < rowcount; i++) {
			for (int j = 0; j < cellcount; j++) {
				data[i-1][j]=sheet.getRow(i).getCell(j).toString();
				}
			
		}
		return data;
		
		
	}
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		readrowdatafromexcel("Sheet1");
	}
}

