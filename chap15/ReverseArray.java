package chap15;
import java.util.Scanner;


 class ReverseArray {
  
  static void swap(int[] a, int ab1, int ab2) {
    int t = a[ab1];
    a[ab1] = a[ab2];
    a[ab2] = t;
  }
  
  static void reverse(int[] a) {
   try{
    for (int i = 0; i < a.length / 2; i++) {
      swap(a, i, a.length - 1 - i);
    }
  } catch (ArrayIndexOutOfBoundsException e) {
    throw new RuntimeException("これは.reverseのバグかな？？", e);
  }
  }
 public static void main(String[] args) {
   Scanner stdIn = new Scanner(System.in);
   System.out.print("要素数 :  ");
   int num = stdIn.nextInt();
   int[] x = new int[num];

   for (int i = 0; i < num; i++) {
     System.out.print("x[" + i + "] : ");   x[i] = stdIn.nextInt();
   }

   try{
     reverse(x);
     System.out.println("要素のあたいをリバースさせました！！");
     for (int i = 0; i < num; i++) {
       System.out.println("x[" + i + "] = " + x[i]);
     }
   } catch (RuntimeException e) {
     System.out.println( "例外         : " + e );
     System.out.println( "例外の原因   : " + e.getCause() );
   }
 }

}
