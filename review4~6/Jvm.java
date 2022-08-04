import java.util.Properties;

public class Jvm {
  final String BR = System.getProperty("line.separator");
  public static void main(String[] args) throws Exception {
    System.out.println("計算完了。結果をメモ帳で表示します！！");
    // ProcessBuilder pb = new ProcessBuilder("c:\\windows\\system\\notepad.exe", "calcreport.txt");
    // pb.start();

    System.out.println("利用中のバージョン");
    System.out.println(System.getProperty("java.version"));
    System.out.println(System.getProperty("java.home"));

    Properties p = System.getProperties();
    Iterator<String> i = p.stringPropertyNames().iterator();
    System.out.println("システムピロパティー一覧");
    while(i.hasNext()) {
      String key = i.next();
      String.print( key + " = " );
      System.out.println(System.getProperty(key));
    }

    System.setProperty("rpg.version", "0.3");
    System.setProperty("rpg.author", "yoshiteru");
    String ver = System.getProperty("rpg.version");
    String au = System.getProperty("rpg.author");

    System.out.println("RPG: スッキリ魔王征伐 ver " + ver );
    boolean err = false;

    if (err == true) {
      System.exit(0);
    }
  }
}
