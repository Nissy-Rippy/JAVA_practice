package aaa.chap06;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

class Array {
  public static void main(String[] mai) {
    Scanner stdIn = new Scanner(System.in);
    Random rand = new Random();

    System.out.print("明日の食べたいご飯はなんですか？:　");
    String menu = stdIn.next();
    String[] menus = { "apple", "banana", "budou" };
    System.out.println(menus);
  }
}