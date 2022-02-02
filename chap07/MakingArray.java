package chap07;

import java.util.Scanner;
import java.util.Arrays;

   class MakingArray {
  public static int[] makeArray(int a) {
    int[] x = new int[a];
    for (int i = 0; i < a; i++) {
      x[i] = i;
    }
    return x;
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    System.out.print("要素:　");
    int num = stdIn.nextInt();
    int[] b = makeArray(num);
    System.out.println(Arrays.toString(b));
  }
}
