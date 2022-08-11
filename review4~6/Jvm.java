import java.util.Properties;
import java.util.Locale;
import java.util.*;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import java.lang.reflect.*;

;

public class Jvm {
  final String BR = System.getPro   perty("line.separator");
a   sf 
  /** 
   * @param args
   * @throws Exception
   */
  public static void main(String[] args) throws Exception {

    TimeZone tz = TimeZone.getDefault();
    System.out.println("現在のタイムゾーン");
    System.out.println(tz.getDisplayName());



    System.out.println("計算完了。結果をメモ帳で表示します！！");
    // ProcessBuilder pb = new ProcessBuilder("c:\\windows\\system\\notepad.exe", "calcreport.txt");
    // pb.start();
    Locale loc = Locale.getDefault();//日本
    System.out.println( loc.getCountry() + " - " + loc.getDisplayCountry() );
    System.out.println( loc.getLanguage() + " - " + loc.getDisplayLanguage() );

    String now = (new SimpleDateFormat()).format(new Date());
    if (loc.getLanguage().equals("ja")){
      System.out.println("現在の時刻は、" + now + "です！");
    }


    System.out.println("利用中のバージョン");
    System.out.println(System.getProperty("java.version"));
    System.out.println(System.getProperty("java.home"));

    Properties p = System.getProperties();
    Iterator<String> i = p.stringPropertyNames().iterator();
    System.out.println("システムピロパティー一覧");
    while(i.hasNext()) {
      String key = i.next();
      System.out.print( key + " = " );
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
