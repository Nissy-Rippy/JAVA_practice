package aaa.chap05;
import java.util.Scanner;

class Start {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int a = 12;
    int b = 012;
    int c = 0x12;
    int d = 0X12;

    System.out.println("a = " + a);
    System.out.println("b = " + b);
    System.out.println("c = " + c);
    System.out.println("d = " + d);

    System.out.print("整数： ");
    int num = stdIn.nextInt();
    System.out.printf("10新数では%dです\n", num);
    System.out.printf("8新数では%oです\n", num);
    System.out.printf("16進数では%xです\n", num);
    int num2 = stdIn.nextInt();
    System.out.printf("numはnum2よりも大きいですか？？\n答え： %b", num < num2);
    double ave = (num + num2) / 2.0  ;
    System.out.println("numとnum2の平均値は：" + ave + "である");
    double sum = (double)(num + num2);
    int aa;
    aa = (int)10.00;
  }
}
