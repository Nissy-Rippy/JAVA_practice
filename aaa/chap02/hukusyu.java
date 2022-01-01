package aaa.chap02;
import java.util.Scanner;
import java.util.Random;

class hukusyu {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    Random rand = new Random();
    
    int a;
    a = 2;
    int b = -1;
    double x = 1.5 * 2;
    final double PI = 3.14;
    x = rand.nextDouble();

    System.out.println("半径" + x + "円の面積" + (PI * x * x) + "です");
    System.out.print("整数aの値: ");
    a = stdIn.nextInt();

    System.out.println(" a / 2 = " + a / 2);
    System.out.println("a % 2 = " + a % 2);
    
    String s = "ABC";
    System.out.println("文字列sは" + s + "です。");

  }

}
