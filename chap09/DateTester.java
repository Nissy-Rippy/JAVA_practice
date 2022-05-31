package chap09;
import java.util.Scanner;

 class DateTester {
  public static void main(String[] args) {
    
    Scanner stdIn = new Scanner(System.in);
    String[] wd = {"月", "火", "水", "木", "金", "土", "日"};
    System.out.println("誕生日を西暦で入力せよ");
    System.out.print("年:　"); int y = stdIn.nextInt();
    System.out.print("月:　"); int m = stdIn.nextInt();
    System.out.print("日:　"); int d = stdIn.nextInt();
    Day birthday = new Day(y, m , d);
    System.out.println("あなたの誕生日は、" 
    + birthday.getYear() + "年" 
    + birthday.getMonth() + "月" 
    + birthday.getDate() + "日は" + wd[birthday.dayOfWeek()] + "曜日です！");

  }
}
