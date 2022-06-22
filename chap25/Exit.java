package chap25;

import java.lang.ProcessBuilder;

public class Exit {

  public static void main(String[] args) throws Exception {
    
    System.out.println("計算を開始します!");

    System.out.println("計算を終了します.結果をメモ帳で表示します！");

    ProcessBuilder pb = new ProcessBuilder("c:\\windows\\system32\\notepad.exe", "calcreport.txt");
    pb.start();
    

    boolean isErr = true;

    if (isErr) {
      System.out.println("異常が発生したので終了します！！！");
      System.exit(1);
    }
    System.out.println("正常に終了しました！");
  }
}
