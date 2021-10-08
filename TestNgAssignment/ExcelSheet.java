package TestNgAssignment;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheet {

	public String[][] excelSheet(String fileName) throws IOException {

		XSSFWorkbook wb = new XSSFWorkbook("./ExcelSheets/"+fileName+".xlsx");
		XSSFSheet ws = wb.getSheet("Sheet1");
		int lastRow = ws.getLastRowNum();
		int lastColumn = ws.getRow(1).getLastCellNum();
		String[][] data = new String[lastRow][lastColumn];
		for (int i = 1; i <= lastRow; i++) {
			for (int j = 0; j < lastColumn; j++) {
				String stringCellValue = ws.getRow(i).getCell(j).getStringCellValue();
				data[i - 1][j] = stringCellValue;
				System.out.println(data[i - 1][j]);
			}

		}
		return data;

	}

}
 