package I_AcessExcelSheetAllData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class AcessExcelSheetAllData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream excel = new FileInputStream("C:/Users/Nikhil/OneDrive/Desktop/QA/Slenium Practices/Book1.xlsx");
		Sheet a = WorkbookFactory.create(excel).getSheet("Sheet2");

		int row = a.getPhysicalNumberOfRows();

		for (int i = 0; i < row; i++) {

			int cell = a.getRow(i).getPhysicalNumberOfCells();

			for (int j = 0; j < cell; j++) {
				
				int s = (int) a.getRow(i).getCell(j).getNumericCellValue();

				System.out.print(" " + s);
			}
			System.out.println();
		}
	}

}
