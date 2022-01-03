package aaa.chap04;
import java.util.Scanner;

class For2 {
  public static void main(String[] args){
  Scanner stdIn = new Scanner(System.in);
  System.out.print("整数値は？：");
  int num = stdIn.nextInt();

  for (int i = 1; i <= num; i += 2){
    System.out.println(i);
  }
  System.out.println("いったん落ち着いて");
 for (int f = 1; f <= num; f++){
   if (num % f == 0)
   System.out.println(f);
 }
 System.out.println("さらに落ち着いて＾＾；");
 for(int x = 1, y = num - 1; x <= num; x++, y--){
   System.out.println(x + " " + y);
 }

  }

}
