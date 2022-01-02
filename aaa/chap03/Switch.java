package aaa.chap03;
import java.util.Scanner;


class Switch {
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    System.out.print("整数は：");
    int n = stdIn.nextInt();

    switch (n){
      case 0:
      System.out.print("A");
      System.out.print("B");
      break;

      case 2:
      System.out.println("C");
      break;

      case 3:
      System.out.println("DEF");
    }
  }
}
