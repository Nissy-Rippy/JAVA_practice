package chap09;
import java.util.Scanner;
import java.util.Arrays;
public class DayTester2 {
  public static void main(String[] args) {
    Day day = new Day(2999, 9,01);
    Scanner stdIn = new Scanner(System.in);
    System.out.printf("あなたの誕生日は、%d年%d月%d日です", day.getYear(), day.getMonth(), day.getDate());
    String[] wd = {"日" + "月" + "火" + "水" + "木" + "金" + "土" + "日" };
    System.out.print("曜日は何個:　");
    int n = stdIn.nextInt();
    Day[] a = new Day[n];
    for (int i = 0; i < n; i++) {
      a[i] = new Day(1020, 3, 33);
    }
    Day[] week = {new Day(120,30,40), new Day(12,3,5), new Day(3,5,7)};
    System.out.println(Arrays.toString(week));
  
  
    Day[] aa;
    aa = new Day[] {new Day(1,1,1), new Day(1,2,3), new Day(4,5,6)};

  
  }
}
