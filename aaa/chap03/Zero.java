package aaa.chap03;

import java.util.Scanner;

class Zero {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    System.out.print("あなたの選んだ整数は：");
    int num = stdIn.nextInt();
    
    if ( num > 0)
      if (!( num % 2  == 0))
        System.out.println("選んだ数値は偶数です");
      else if (!(num % 2 != 0))
        System.out.println("選んだ数値は奇数です");
      else if (num == 0)
        System.out.println("数値は0です");
    else
     System.out.println("整数ではありません");

  }
}
