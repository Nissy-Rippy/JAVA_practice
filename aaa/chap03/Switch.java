package aaa.chap03;

import java.util.Scanner;

class Switch {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    System.out.print("好きな数字を入力してください:  ");

    int num = stdIn.nextInt();

    while (num < 0 || num > 2) {
      System.out.println("入力が正しくありません。もう一度お願いします。");
      System.out.print("入力値:　");
      num = stdIn.nextInt();
    }

    switch (num) {

      case 0:
        System.out.println("A");
        System.out.println("B");
        break;

      case 1:
        System.out.println("CDE");
        break;

      case 2:
        System.out.println("FGHIJK");
        break;

    }
  }
}
