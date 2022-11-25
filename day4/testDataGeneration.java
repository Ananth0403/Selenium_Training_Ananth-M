package day4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class testDataGeneration {
	
	public void sample() {
		Object[][] arr=null;
				
				try {
					XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream(new File("./testdata/sapientTestData.xlsx")));
					int rows = wb.getSheet("LoginData").getPhysicalNumberOfRows();
					int columns = wb.getSheet("LoginData").getRow(0).getPhysicalNumberOfCells();
					arr = new Object[rows][columns];
					
					for(int i=0;i<rows;i++) {
						for(int j=0;j<columns;j++) {
							arr[i][j]=wb.getSheet("LoginData").getRow(i).getCell(j).getStringCellValue();
						}
					}
				System.out.println(arr);
				
				wb.close();
				
				}catch(Exception e) {
					e.printStackTrace();
				}

	}
	
}
