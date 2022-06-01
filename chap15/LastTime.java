package chap15;

import java.util.Scanner;
import java.io.*;

public class LastTime {
 
 public static void init() {
   BufferedReader br = null;
  
   try {
     br = new BufferedReader(new FileReader("LastTime.txt"));
    String kibun = br.readLine();
    System.out.println("前回の気分は" + kibun + "でした");
  } catch (IOException e) {
    System.out.println("  この機能を実行するのは初めてですね！！");
  } //finallyを使うととりあえずエラーが起きても実行する内容
  finally {
    try{
    if (br != null)
      br.close();
    } catch (IOException e) {
       System.out.println("クローズ失敗＞＜");
    }
 }
}

 public static void term(String kibun) {
   FileWriter fw = null;
   try {
     fw = new FileWriter("LastTime.txt");
     fw.write(kibun);
   } catch (IOException e) {
     System.out.println("エラー発生！！");
   } finally {
     if (fw != null) {
       try {
         fw.close();
       } catch (IOException e) {
         System.out.println("クローズ失敗!!");
       }
     }
   }
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    init();
    System.out.print("今日の気分は　:　");
    String n = stdIn.next();
    term(n);
    init();
  }
}
