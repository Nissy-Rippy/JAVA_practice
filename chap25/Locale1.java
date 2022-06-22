package chap25;

import java.util.*;
import java.util.TimeZone;
import java.text.*;
import java.util.Date;
import java.util.Locale;

public class Locale1 {
  public static void main(String[] args) {
    
    Locale loc = Locale.getDefault();
    System.out.println(loc.getCountry() + " - " + loc.getLanguage());
    String now = (new SimpleDateFormat().format(new Date()));

    if (loc.getLanguage().equals("ja")) {
      System.out.println("現在の時刻は," + now + "です");
    } else {
      System.out.println("Current time is " + now + "です！");
    }

    TimeZone tz = TimeZone.getDefault();
    System.out.print("現在のタイムゾーん:  ");
    System.out.println( tz.getDisplayName() );
    
    if (tz.useDaylightTime()) {
      System.out.println("夏時間を採用しています");
    } else {
      System.out.println("夏時間を採用していません");
    }
    
    System.out.print("世界標準時との時差は, ");
    System.out.println(tz.getRawOffset() / 3600000 + "時間である！");

  }
}
