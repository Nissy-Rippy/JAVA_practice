package chap07;
import java.util.Scanner;


 class Reverse {
  public static void swap(int[] x, int a, int b) {
      int t = x[a]; x[a] = x[b]; x[b] = t;
  }
  
  public static void reverse(int[] v) {
    for (int i = 0; i < v.length / 2; i++) {
       swap(v, i, v.length - i - 1);
    }
  }
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
     System.out.print("要素数: ");
     int num = stdIn.nextInt();
     int[] array = new int[num];
     for (int i = 0; i < array.length; i++) {
       System.out.print("x[" + i + "] : ");
       array[i] = stdIn.nextInt();
     }
     System.out.println("要素の並びを反転させました");
     reverse(array);
      for (int i = 0; i < array.length; i++)
       System.out.println("x[" + i + "] = " + array[i]);
  }
}