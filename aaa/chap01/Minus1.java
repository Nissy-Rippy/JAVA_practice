package aaa.chap01;
import java.util.Scanner;

class Minus1 {
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    int x = stdIn.nextInt();
    int y = -x;

    System.out.println(x + "と" + y + "は真逆である？？");

    double z = stdIn.nextDouble();
    System.out.println(z);

  }
}

