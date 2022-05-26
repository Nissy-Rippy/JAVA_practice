package chap07;

import java.util.Random;
import java.util.Scanner;

class Anzan {
  static Scanner std = new Scanner(System.in);

  public static boolean confirmEntry() {
    int cont;
    do {
      System.out.print("もう一度やりますか？　＜Yse・・・1//NO・・・0  :  ＞");
      cont = std.nextInt();
    } while (cont != 1 && cont != 0);//１か０以外ならもう一度記入する形になっている。
      return cont == 1; //1ならtrueなので、続く０なら、while文の条件がfalseになるので終わる。
  }

  public static void main(String[] args) {
    Random rand = new Random();
    System.out.println("暗算トレーニング開始！！");
    do {
      int x = rand.nextInt(900) + 100;
      int y = rand.nextInt(900) + 100;
      int z = rand.nextInt(900) + 100;
      while (true) {
        System.out.print(x + "+" + y + "+" + z + "=  ");
        int sum = std.nextInt();
        if (sum == x + y + z) {
          System.out.println("正解です！！");
          break;
        } else {
          System.out.println("不正解です：ｗ：");
        }
      }
    } while (confirmEntry());
  }
}
