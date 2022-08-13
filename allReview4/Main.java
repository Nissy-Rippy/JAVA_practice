import java.io.*;
import java.io.BufferedInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Properties;
import java.util.Iterator;



import java.io.BufferedReader;

import java.io.BufferedReader;


public class Main {

  final String BR = System.getProperty("line.separator");

  public static void main(String[] args) throws IOException {
   
    System.out.println("計算を開始します");
    System.out.println("計算完了！！");

    ProcessBuilder pb = new ProcessBuilder(
      "c:\\windows\\system32\\notepad.exe",
      "calcreport.txt"
    );
    pb.start();

    ProcessBuilder pb2 = new ProcessBuilder("cmd", "/c", "echo", "Hello!!!");
    pb2.redirectErrorStream(true);

    Process process = pb2.start();

    try(BufferedReader br = new BufferedReader( new InputStreamReader(process.getInputStream(), Charset.defaultCharset() ))){
      String line;

      while ( ( line = br.readLine() ) != null ) {
        System.out.println(line);
      }      
    }
    int result = process.exitValue();
    System.out.printf("result = %d%n", result);

    // boolean isError = true;
    // if (isError) {
    //   System.exit(1);
    // }
    // System.out.println("正常終了しました");

    System.out.println(System.getProperty("java.version"));
    System.out.println(System.getProperty("java.home"));
    System.out.println(System.getProperty("line.separator"));

    Properties p = System.getProperties();
    Iterator<String> is = p.stringPropertyNames().iterator();

    System.out.println("システムプロパティー一覧！");
    while ( is.hasNext() ) {
      String key = is.next();
      System.out.print("key = " + key + ": value = " );
      System.out.println(System.getProperty(key));
    }

    System.setProperty("java.user", "Nissy-!");
    String user = System.getProperty("java.user");
    System.out.println(user);

  }
}
