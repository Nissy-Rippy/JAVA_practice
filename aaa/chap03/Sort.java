package aaa.chap03;
import java.util.Scanner;

class Sort {
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    System.out.print("整数a:  "); int a = stdIn.nextInt();
    System.out.print("整数b:  "); int b = stdIn.nextInt();
    
    System.out.println("2つの整数をソートします");
    if (a > b){
      int t = a;
      a = b;
      b = t;
    }
    System.out.println("小さいのは" + a);
    System.out.println("大きいのは" + b);

  }
}
