package modernization.web;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelStack {

	public static String getCellValue(String excelName, String sheetName) throws IOException {
		String value = null;
		try {
			System.out.println(System.getProperty("user.dir") + "\\TestData\\" + excelName + ".xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream(
					new File(System.getProperty("user.dir") + "/TestData/" + excelName + ".xlsx")));
			Sheet st = wb.getSheet(sheetName);
			Row rv = st.getRow(0);
			Cell cv = rv.getCell(0);
			 value = formatCelltoString(cv);
			System.out.println(value);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
	}

	public static String formatCelltoString(Cell cell) {
		String cellvalue = "n/a";
		if (cell != null) {
			switch (cell.getCellType()) {
			case STRING:
				cellvalue = cell.getStringCellValue();
				break;
			case NUMERIC:
				if (DateUtil.isCellDateFormatted(cell)) {
					cellvalue = cell.getDateCellValue().toString();
				} else {
					cellvalue = Double.toString(cell.getNumericCellValue());
				}
				break;
			case BLANK:
				cellvalue = "";
				break;

			case BOOLEAN:
				cellvalue = Boolean.toString(cell.getBooleanCellValue());
				break;
			case ERROR:
				cellvalue = "cell currupted";
				break;
			}
		}
return cellvalue;
	}
}
