package chap25;

import java.lang.ProcessBuilder;
import java.io.*;
public class Exit {

  public static void main(String[] args) throws Exception {
    

    ProcessBuilder pb1 = new ProcessBuilder("c:\\windows\\system32\\notepad.exe", "F");

    // ProcessBuilder pb = new ProcessBuilder();
    // pb.command("/tmp/Test.sh");
    pb1.redirectOutput(ProcessBuilder.Redirect.INHERIT);
    pb1.redirectError(ProcessBuilder.Redirect.INHERIT);

    try {
      ProcessBuilder pb3 = new ProcessBuilder("ZoomInstaller.exe");
      pb3.start();

    } catch (IOException e) {
      System.out.println(e);
    } finally {
      Process process = pb1.start();
      int ret = process.waitFor();
      System.out.println(ret);
    }

    
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
