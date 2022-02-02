package chap07;

import java.util.Scanner;

class LinerSearch {

  public static int liner(int[] a, int b) {
    for (int i = 0; i < a.length; i++) {
      if (a[i] == b) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    System.out.print("要素数:  ");
    int n = stdIn.nextInt();
    int[] array = new int[n];
    for (int i = 0; i < n; i++) {
      System.out.print("x[" + i + "]: ");
      array[i] = stdIn.nextInt();
    }
    System.out.print("探す値: ");
    int s = stdIn.nextInt();
    int search = liner(array, s);
    if (search == -1) {
      System.out.println("その要素はありません");
    } else {
      System.out.println("その要素はx[" + search + "]にあります");
    }
  }
}
