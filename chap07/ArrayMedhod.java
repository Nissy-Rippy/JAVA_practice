package chap07;
import java.util.Scanner;

  class ArrayMedhod {

  static int maxOf(int[] a) {
   int max = a[0];
   for (int i = 1; i < a.length; i++) {
    if (max < a[i]) {
      max = a[i];
    }
   }
   return max;
  }

  // int[] height;
  // int[] weight;
    public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    System.out.print("人数は： ");
    int n = stdIn.nextInt();
    int[] height = new int[n];
    int[] weight = new int[n];
    System.out.println(n + "人の身長と体重を入力せよ！");
   
    for (int i = 0; i < n; i++) {
      System.out.print(i + "番の身長:  ");  height[i] = stdIn.nextInt();
      System.out.print(i + "番の体重:  ");  weight[i] = stdIn.nextInt();
    }
   
    System.out.println("最も身長が大きい人は" + maxOf(height) + "cmです");
    System.out.println("最も体重がおもい人は" + maxOf(weight) + "kgです");
  }

}