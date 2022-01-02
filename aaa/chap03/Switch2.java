package aaa.chap03;
import java.util.Scanner;

class Switch2 {
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    System.out.print("季節を求めています！！番号を記入してください＾＾");
    int month = stdIn.nextInt();

    String season = switch(month){
      case 3,4 -> "春";
      case 6,7 -> "夏";
      case 8,9 -> "冬";
      case 10,11 -> "秋";
      default    -> "よくわからない";
    };

    System.out.println("季節は" + season + "です");
  }
}
