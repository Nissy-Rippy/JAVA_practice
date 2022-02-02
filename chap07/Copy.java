package chap07;
import java.util.Scanner;

 class Copy {
   public static int[] copy(int[] a) {
     int[] x = new int[a.length];
     for (int i = 0; i < a.length; i++) {
       x[i] = a[i];
     }
     return x;
   }
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    System.out.print("要素数はいくつの配列にしますか？: "); int count = stdIn.nextInt();
    int[] array = new int[count];
    for(int i = 0; i < count; i++) {
      System.out.print("array[" + i + "] =  ");
      array[i] = stdIn.nextInt();
    }
    System.out.println("この配列をコピーします");
    int[] yy = copy(array);

    for(int i = 0; i < count; i++) {
      System.out.println("yy[" + i + "] =  " + yy[i]);
    }
  }
}