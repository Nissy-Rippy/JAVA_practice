package aaa.chap04;
import java.util.Scanner;

class sankaku {
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    System.out.println("99のカレンダーを作ります");
      for (int i = 1; i <= 9; i++){
        for(int j = 1; j <= 9; j++){
          if (i * j < 10)
          System.out.print("  ");
          else
          System.out.print(" ");
          System.out.print(i * j);
        }
        System.out.println();
      }
    System.out.print("直角三角形を作ります！何段作りますか？？");
    int num = stdIn.nextInt();
     for (int x = 1; x <= num; x++){
       for (int y = 1; y <= x; y++){
         System.out.print("*");
       }
       System.out.println();
     }
  }
}
