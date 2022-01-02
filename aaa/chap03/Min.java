package aaa.chap03;
import java.util.Scanner;

class Min {
  public static void main(String[] args){
    Scanner num = new Scanner(System.in);
    System.out.print("整数a"); int a = num.nextInt();
    System.out.print("整数b"); int b = num.nextInt();

    int min;
    
    if(a < b)
     min = a;
    else
     min = b;
    
    System.out.println("小さいのは" + min + "です//");

     System.out.print("整数c"); int c = num.nextInt();
     System.out.print("整数d"); int d = num.nextInt();

     System.out.println("数が小さい方は" + (c < d ? c : d) + "です");

  }
}

