package chap25;

import java.util.Locale;

public class MemoryEater {
  public static void main(String[] args) {
    
    Locale loc = Locale.getDefault();

    if (loc.getLanguage() == "ja") { 
      System.out.println("メモリを消費しています！");
    } else {
      System.out.println("eating memory////");

    }
    long[] larray = new long[12800000];
    for (int i = 0; i < larray.length; i++) {
      larray[i] = i;
    }
  }
}
