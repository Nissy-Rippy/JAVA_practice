package chap07;

import java.util.Scanner;

public class Max {
  public static int max(int a, int b, int c) {
    int sum = a + b + c;
    return sum;
  }

  public static int max(int a, int b) {
    int sum = a + b;
    return sum;
  }

  public static void main(String... args) {
    Scanner stdIn = new Scanner(System.in);
    System.out.println(max(3, 4, 5));
    System.out.println(max(3, 4));
  }
}
