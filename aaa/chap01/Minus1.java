package aaa.chap01;

import java.util.Scanner;

class Minus1 {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int x = stdIn.nextInt();
    int y = -x;
    System.out.println(x + "と" + y + "は真逆である？？");
    double z = stdIn.nextDouble();
    System.out.println(z);
    switch (x) {
      case 1, 2:
        System.out.println("春だよー");
      case 3, 4, 5:
        System.out.println("夏だよー！！！");
      case 76, 54, 32:
        System.out.println("冬だよー！！");
      default:
        if (x == 44) {
          x = y;
        }
        ;
        break;
    }
    Outer:
    for (int xx = 0, yy = x - 1; xx <= x; xx += 2, yy -= 4)
      if (xx == 4) {
        System.out.println("おしりに穴ができましたそのため、break ");
        break Outer;
      }
    if (yy == 3) {
      System.out.println("ふの値の時は末尾に飛びます！");
      continue Outer;
    }

    System.out.println('-');

    int i;
    for (i = 1; i <= 4; i++) {
      String f = String.format("%%%dd\n", i);
      System.out.printf(f, 5);
    }

    int y;
    for (y = 0; y <= 5; y+=2) {
      System.out.printf(String.format("%%%dd\n", y), 5);
    }
  }
}
