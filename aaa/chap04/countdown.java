package aaa.chap04;
import java.util.Random;
import java.util.Scanner;

class countdown {
  public static void main(String[] args){
     Scanner stdIn = new Scanner(System.in);
     Random rand = new Random();

     System.out.print("カウントダウン始めるよ！数字を押してね！：：");
     int x;
     do {
       x = stdIn.nextInt();
     } while (x <= 0);
     System.out.println("始めるよー!!");
     while (x >= 0){
       System.out.println(x--);
     }
  }
}
