
import java.util.*;
import java.util.concurrent.*;

public class Countdown {
  public static void main(String[] args) {
    System.out.println("止めるには「STOP」してください！");
    System.out.println("カウントダウンを開始します！！");

    for (int i = 9; i >= 0; i--) {
      System.out.println(i + "..");
      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException e) {;}
    }
    
    String input = new Scanner(System.in).nextLine();
    System.out.println("入力文字列: " + input);
    System.out.println("停止処理は未作成です！");
    
  }
  
}
