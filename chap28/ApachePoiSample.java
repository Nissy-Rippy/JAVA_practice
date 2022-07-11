import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ApachePoiSample {

  /** 入力Excelファイルパス */
  public static final String IN_EXCEL_FILE_PATH = "excel/in/sample.xlsx";
  /** 出力Excelファイルパス */
  public static final String OUT_EXCEL_FILE_PATH = "excel/out/output.xlsx";

  public static void main(String[] args) {

    // ---- Excelファイルを開く ----
    Workbook wb = null;
    try (InputStream is = new FileInputStream(IN_EXCEL_FILE_PATH);) {
      wb = WorkbookFactory.create(is);
    } catch (FileNotFoundException e) {
    // 対象のExcelファイルが存在しない場合に発生
      e.printStackTrace();
    } catch (IOException e) {
      // 対象のExcelファイルの読み込みに失敗した場合に発生
      e.printStackTrace();
    } catch (EncryptedDocumentException e) {
      // 対象のExcelファイルにパスワードが設定されている場合に発生
      e.printStackTrace();
    } catch (InvalidFormatException e) {
      // 対象のExcelファイルが無効な形式である場合に発生
      e.printStackTrace();
    }

    // 対象のシートを選択する
    Sheet sheet1 = wb.getSheet("Sheet1");

    // ---- A列の各セルから値を取得する ----
    System.out.println("＜入力＞");

    // 文字列を取得する
    Row row = sheet1.getRow(0); // 1行目
    Cell cell = row.getCell(0); // A列
    String a1 = cell.getStringCellValue();
    System.out.println("A1 : " + a1);

    // 数値を取得する
    row = sheet1.getRow(1); // 2行目
    cell = row.getCell(0); // A列
    double a2 = cell.getNumericCellValue();
    System.out.println("A2 : " + a2);

    // 数式を取得する
    row = sheet1.getRow(2); // 3行目
    cell = row.getCell(0); // A列
    String a3 = cell.getCellFormula();
    System.out.println("A3 : " + a3);

    // ---- 出力用にB列に値を追記する（B列は空のため、新規にセルを作成する）----
    System.out.println("＜出力＞");

    // 文字列を出力する
    row = sheet1.getRow(0); // 1行目
    cell = row.createCell(1); // B列の作成
    cell.setCellValue(a1 + a1);
    System.out.println("B1 : " + cell.getStringCellValue());

    // 数値を出力する
    row = sheet1.getRow(1); // 2行目
    cell = row.createCell(1); // B列の作成
    cell.setCellValue(a2 + a2);
    System.out.println("B2 : " + cell.getNumericCellValue());

    // 数式を出力する
    row = sheet1.getRow(2); // 3行目
    cell = row.createCell(1); // B列の作成
    cell.setCellFormula("B2*2");
    System.out.println("A3 : " + cell.getCellFormula());

    // ---- Excelファイルに出力する ----
    try (FileOutputStream os = new FileOutputStream(OUT_EXCEL_FILE_PATH);) {
      wb.write(os);
    } catch (FileNotFoundException e) {
      // 出力先に指定されたパスが存在しない場合に発生
      e.printStackTrace();
    } catch (IOException e) {
      // Excelファイルの出力に失敗した場合に発生
      e.printStackTrace();
    }
  }

}