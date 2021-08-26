package new1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class NeweRead {

	public static void main(String[] args) throws IOException {
		String file ="data/Sample.xls";
		FileInputStream fis = new FileInputStream(file);
		
		Workbook wb = new HSSFWorkbook(fis);
		Sheet sh=wb.getSheet("Sheet1");
		for(Row r:sh) {
			for(Cell c:r) {
				String t=c.getStringCellValue();
				System.out.println(t);
			}
		}
		wb.close();
		fis.close();

	}

}
