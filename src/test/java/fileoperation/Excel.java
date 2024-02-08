package fileoperation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main (String[]args) throws IOException{
		File a = new File("C:\\Users\\manik\\eclipse-workspace\\MavenProject\\target\\ExcelRead.xlsx");
		
		
		FileInputStream b = new FileInputStream(a);
		
		Workbook c = new XSSFWorkbook(b);
		
		Sheet d = c.getSheet("Sheet1");
		
		for (int i = 0; i < d.getPhysicalNumberOfRows(); i++) {
			
			Row row = d.getRow(i);
			
			
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				
				Cell cell = row.getCell(j);
				
				int cellType = cell.getCellType();
				
				if (cellType==1){
					
					String value = cell.getStringCellValue();
					
					System.out.println(value);
					
				}
				else {
					if(DateUtil.isCellDateFormatted(cell)){
						Date k = cell.getDateCellValue();
						SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
						String value = date.format(k);
						System.out.println(value);			
						
					}else {
						long num = (long) cell.getNumericCellValue();
						System.out.println(num);
						
						
					}
				}
				
				
			}
			
			
		}
		
		
	}
}
