package chap07;

import java.util.Scanner;

class Copy {

  public static int linerSearch(int[] a, int b) {
    for (int i = 0; i < a.length; i++) {
      if (a[i] == b)
        return i;
    }
    return -1;
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    System.out.print("配列要素いくつの配列作りませすか・・・？:　");
    int count = stdIn.nextInt();
    int[] x = new int[count];
    System.out.println("自分で要素のあたいを決めよう.");
    for (int i = 0; i < x.length; i++) {
      System.out.print("x[" + i + "] = ");
      int num = stdIn.nextInt();
    }

    System.out.println("それでは、ほかの方に自分の思った数値が要素の中にあるか確かめてみましょう！！");
    int xyz;
    do {
      System.out.print("あなたの思った数値: ");
      int c = stdIn.nextInt();
      int search = linerSearch(x, c);

      if (search == -1) {
        System.out.println("申し訳ございませんが、その数値はありませんね・・・");
      } else {
        System.out.println("やりましたね！！あります！！");
      }

      do {
        System.out.print("もういちどやりますか？＜0・・はい　｜ １・・いいえ＞:  ");
        xyz = stdIn.nextInt();
      } while (xyz != 0 && xyz != 1);
    } while (xyz == 0);
  }

}
