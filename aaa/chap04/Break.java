package aaa.chap04;
import java.util.Scanner;

class Break {
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    System.out.println("整数を足していくよー");
    System.out.print("なにか致していく？？   ");
    int n = stdIn.nextInt();
    int sum = 0;
    int num;
    for (int i = 0; i <= n; i++){
      System.out.print("足す数は？");
      num = stdIn.nextInt();
      if(num == 0){
        break;
      } else if (num < 0) {
        continue;
      }
      sum += num;
    }
    System.out.println("合計は" + sum +"ですよ！");
  }


}
