package review;

import java.util.*;
import java.text.*;
import java.util.Locale;
import java.lang.ProcessBuilder;
import java.util.Iterator;
import java.util.Properties;
import java.lang.Process;


public class Review4 {
  public static void main(String[] args) throws Exception {
    Locale loc = Locale.getDefault();
    System.out.println(loc.getCountry() + " - " + loc.getLanguage());
    String now = (new SimpleDateFormat().format(new Date()));
    System.out.println(now);


    final String BR = System.getProperty("line.Separator");
    System.out.println("本日は" + BR + "晴天なり!!");
    boolean isErr = true;
    System.exit(0);//0は正常な終了
    System.exit(1);//1は異常な終了

    ProcessBuilder pb = new ProcessBuilder("java.version");
    Process go = pb.start();
    go.waitFor();

    System.out.println(System.getProperty("java.home"));
    System.out.println(System.getProperty("java.os"));

    System.out.println(System.getProperties());


    Properties pro = System.getProperties();
    Iterator<String> i = pro.stringPropertyNames().iterator();

    while (i.hasNext()) {
      String key = i.next();
      System.out.print(key + " = ");
      System.out.println(System.getProperty(key));
    }

    Class<?> info = Review1.class;
    System.out.prntln(info.getName());
    System.out.prntln(info.getPackage());
    System.out.prntln(info.getModule());
    System.out.prntln(info.getSuperclass());
    System.out.prntln(info.isArray());
    System.out.prntln(info.isInterface());
    System.out.prntln(info.isEnum ());
    System.out.println(args.getClass());

    Constructor<?> cons = info.getDeclaredConstructors();
    Fields[] field = info.getDeclaredFields();
    Methods[] methods = info.getDeclaredMedhods();



  }
}
