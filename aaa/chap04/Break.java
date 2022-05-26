package aaa.chap04;
import java.util.Scanner;

class Break {
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    System.out.println("整数を足していくよー");
    System.out.print("なん回足していく？？   ");
    int n = stdIn.nextInt();

    int sum = 0;
    int num;
    for (int i = 0; i < n; i++) {
      System.out.print("0以上の数を入力してください。０の場合終了してそれまでの数の合計を出します。");
      num = stdIn.nextInt();
      if (num == 0) {
        System.out.println("０が入力されたので合計を出して終了します//");
        break;
      } else if (num < 0) {
        System.out.println("0以下なので足しません");
        continue;
      }
      sum += num;
    }
    System.out.println("合計は" + sum +"ですよ！");
  }


}
