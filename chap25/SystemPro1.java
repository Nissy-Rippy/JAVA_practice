package chap25;

import java.util.*;

public class SystemPro1 {
  

  public static void main(String[] args) {

    System.out.println("本日は\n晴天なり");
    
    //macでもwindowsでも同じ動きをするようになる
    final String f = System.lineSeparator();// これでもOK!!
    final String BR = System.getProperty("line.separator");//上と同じ

    System.out.println("本日は" + BR + "晴天なり");

    // システムプロパティーの設定 新しく追加するキーや値には任意の文字列を使うことが出来る。
    System.setProperty("rpg.version", "0.3");
    String ver = System.getProperty("rpg.version");
    String author = System.getProperty("rpg.author");
    System.out.println("RPG: ｽｯｷﾘ魔王征伐 ver " + ver );
    System.out.println("Developed by  " + author);
    //OSの環境変数をJavaのプログラム内で取得するにはＳystemクラスのgetenv()メソッドを使うとできる！
    System.out.println(System.getenv());

  }
}

