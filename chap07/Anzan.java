package chap07;
import java.util.Random;
import java.util.Scanner;

   class Anzan {
  static Scanner std = new Scanner(System.in);

  public static boolean confirm (){
    int cont;
    do {
      System.out.print("もう一度やりますか？　＜Yse・・・1//NO・・・2  :  ＞");
      cont = std.nextInt();
    } while (cont != 1 && cont != 2);
    return cont == 2;
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
  }while(confirm());
  }
}

