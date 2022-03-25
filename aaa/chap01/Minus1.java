package aaa.chap01;

import java.util.Scanner;

class Minus1 {
  static double[] ind(double ff) {
    double[] fe = new double[(int) ff];
  
  }
  static int[] idxArray(int n) {
   int[] a = new int[n];
   for (int i = 0; i < n; i++) {
     a[i] = i;
   }
  return a;
 }
 static int sum(int a, int b, int... no) {
   int s = a + b;
   for (int i = 0; i < no.length; i++) {
     s += no[i];
   }
   return s;
 }


  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int x = stdIn.nextInt();
    int y = -x;
    int[] ogb = idxArray(4);
    sum(3,4, ogb);

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
      continue Inner;
    int i;
    for (i = 1; i <= 4; i++) {
      String f = String.format("%%%dd\n", i);
      System.out.printf(f, 5);
    }

    int y;
    for (y = 0; y <= 5; y+=2) {
      System.out.printf(String.format("%%%dd\n", y), 5);
      System.out.println();
    }

    int[] a = {2,4,5,6,7,8};
    int[]aa;
    aa = new int[] {4,5,6,7};
    int[] ab = new int[4];
    ab[1] = 4;
    ab[2] = 45;
    for (int abb : ab) {
      abb += abb;
    }
    int[][]  ax = new int[4][4];
    int[][] xxy = {{4,3},
                   {4,3},
                   {4,5}
                  };
  int ibc = linearSearch(new int[] {5,3,2}, 4);
  }
}
