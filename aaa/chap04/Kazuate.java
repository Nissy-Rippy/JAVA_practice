package aaa.chap04;
import java.util.Scanner;
import java.util.Random;

 class Kazuate {
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    Random rand = new Random();
    System.out.println("一体どんな数でしょう！！選んでね＾＾");
    System.out.println("1~99 の間であてよう＾＾");
    int num = rand.nextInt(100);
    int x;
    
    do {
      System.out.print("いくつかな？？::");
      x = stdIn.nextInt();
      if (x < num){
        System.out.println("もっと大きな数字だよー");
      } else if (x > num){
        System.out.println("もっと小さな数字だよ＾＾");
      }
    } while( x != num);
    System.out.println("正解です！！！！");
  }
}
