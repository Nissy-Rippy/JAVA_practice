package chap25;

import java.lang.Runtime;
//Runtimeの戻り値はすべてlong型である！！
public class Runtime1 {
  public static void main(String[] args) {
    //基本的にRuntime.getRuntime().まではおなじ！
    long f = Runtime.getRuntime().freeMemory() / 1024 / 1024;//残りメモリ
    long ff = Runtime.getRuntime().maxMemory() / 1024 / 1024;//メモリの総量の限界値
    long fff = Runtime.getRuntime().totalMemory() / 1024 / 1024;//現在のメモリ総容量

    System.out.println(f);
    System.out.println(ff);
    System.out.println(fff);

  }
}
