package chap07;
import java.util.Scanner;

public class Chagingnum {
  public static int sum(int a, int b, int... no) {
    int s = a + b;
    for (int i = 0; i < no.length; i++) {
      s += no[i];
    }
    return s;
  }
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    System.out.println("sum(1, 2) =  " + sum(1, 2));
    System.out.println("sum(1, 2) =  " + sum(1, 2, 3));
    System.out.println("sum(1, 2) =  " + sum(1, 2, 3, 4, 5, 6));
    System.out.println("sum(1, 2) =  " + sum(1, 2, 4, 5, 6, 7));

    System.out.print("配列の要素数:　");
    int xx = stdIn.nextInt();
    int[] yy = new int[xx];
    for (int i = 0; i < xx; i++) {
      System.out.print("yy[" + i + "] = ");
      yy[i] = stdIn.nextInt();
    }
    System.out.println("合計は、" + sum(1, 2, yy));
  }
}
