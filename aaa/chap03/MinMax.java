package aaa.chap03;
import java.util.Scanner;

class MinMax {
  public static void main(String[] args){
    Scanner num = new Scanner(System.in);

    System.out.print("整数a: ");  int a = num.nextInt();
    System.out.print("整数b: ");  int b = num.nextInt();
    
    int max;
    int min;

    if(a < b){
      min = a;
      max = b;
    }
    else{
      max = a;
      min = b;
    }
    System.out.println("最大値は" + max + "です。最小値は" + min + "です・・・・");
  }
}
