package chap25;

import java.util.*;

public class Systempro {
   public static void main(String[] args) {
    // System.out.print("利用中のJavaのバージョン: ");
    // System.out.println( System.getProperty("java.version") );

    // Properties p = System.getProperties();

    // Iterator<String> i = p.stringPropertyNames().iterator();
    // System.out.println("システムプロパティ一覧！");

    // while (i.hasNext()) {
    //   String key = i.next();
    //   System.out.print(key + " = ");
    //   System.out.println(System.getProperty(key));
    // }
    System.out.println("本日は\n晴天なり");

    final String f = System.lineSeparator();//これでもOK!!

    final String BR = System.getProperty("line.separator");
    
    System.out.println("本日は" + BR + "晴天なり");

    //システムプロパティーの設定　　新しく追加するキーや値には任意の文字列を使うことが出来る。
    System.setProperty("rpg.version", "0.3");

   }
}