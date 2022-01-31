package aaa.chap06;
import java.util.Scanner;
import java.util.Arrays;
 class Test {
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    final int NUMBER = 5;
    int sum = 0;
    System.out.println(NUMBER + "の人の点数をを表示せよ");
    int[] tensu = new int[NUMBER];

    for (int i = 0; i < NUMBER; i++) {
      System.out.print((i + 1) + "番目の人の点数:  " );
      int score = stdIn.nextInt();
      sum += score;
    }
    System.out.println("合計は、" + sum);
    System.out.println("平均点は" + (double)sum / NUMBER + " 点です。");
    System.out.println(Arrays.toString(tensu));

  }
}
