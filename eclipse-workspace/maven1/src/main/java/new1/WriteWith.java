package new1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class WriteWith {

	public static void main(String[] args) throws IOException {
		String file = "data/Sample.xls";
		FileOutputStream fos = new FileOutputStream(file);
		 
		Workbook wb = new HSSFWorkbook();
		
		Sheet sh = wb.createSheet("Sheet1");
		Row r= sh.createRow(0);
		Cell c=r.createCell(0);
		c.setCellValue(" My name is khan");
		wb.write(fos);
		
		fos.close();
		wb.close();
		

	}

}
