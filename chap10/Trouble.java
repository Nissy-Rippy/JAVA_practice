package chap10;

import java.util.Date;

public class Trouble {
public static void main(String[] args) {

  Day[] a = new Day[4];
  for (int i = 0; i <= 4; i++) {
    a[i] = new Day();
    a[i].set(2021, 3, 3);
  };
Day nd = new Day(a[2]);

// public String toString() {
//   String[] wd = { "日", "月", "火", "水", "木", "金", "土", "日" };
//   return String.format("%04d年%02d月%02d日、%s曜日\n", a[i].getYear(),a[i].getMonth(), a[i].getDate(), wd[i]);
// }

}
}