import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;
import java.io.*;

public class ExcelFile {

    public static void main(String[] args) throws Exception {

        Workbook book = new XSSFWorkbook();// excelファイルを作成
        Sheet sheet = book.createSheet("カード");// Sheetの作成
        Row row = sheet.createRow(0);// 横一列取得
        row.createCell(0).setCellValue("ひのきぼう");// 名前A1に記入
        row.createCell(1).setCellValue(5);// たんか B1に記入
        row.createCell(2).setCellValue(33);// 数量 C1に記入
        row.createCell(3).setCellFormula("=B1*C1");// 合計金額

        try (OutputStream file = new FileOutputStream("workbook.xlsx")) {
            book.write(file);
        }
    }
}
