package aaa.chap03;
import java.util.Scanner;

class Max {
  public static void main(String[] args){
    Scanner max = new Scanner(System.in);
    System.out.print("整数a: "); int a = max.nextInt();
    System.out.print("整数b: "); int b = max.nextInt();
    System.out.print("整数c: "); int c = max.nextInt();

    int num = a;
    if (num < b) num = b;
    if (num < c) num = c;

    System.out.println("最大値は" + num + "です");

  }
}