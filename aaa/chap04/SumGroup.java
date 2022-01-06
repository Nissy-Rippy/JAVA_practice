package aaa.chap04;
import java.util.Scanner;

class SumGroup {
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    int total = 0;
    System.out.println("計算を行います");
    
    Outer:
    for (int j = 0; j < 10; j++ ){
     int sum = 0;
     System.out.println("第" + j + "グループ");
    Inner:
     for (int i = 0; i < 5; i++){
        System.out.print("整数： ");
        int num = stdIn.nextInt();
        if (num == 0) {
          break Outer;
        } else if (num < 0) {
          continue Inner;
        }
        sum += num;
      }
      System.out.println("小計" + sum + "です");
      total += sum;
    }
    System.out.println("合計は" + total + "になったよーー");
  }
}
