package aaa.chap06;

import java.util.Scanner;

class Bicyclemain {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    Bicycle bicycle = new Bicycle("ビアンキ", "緑");
    bicycle.printData();
    System.out.println("-----------------");
    System.out.print("走る距離を入力してください：");
    int meter = stdIn.nextInt();
    System.out.println(meter + "走ります");
    bicycle.run(meter);

  }
}
