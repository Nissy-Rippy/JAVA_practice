package chap17;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DateApp {
  public static void main(String[] args) {

    Date date = new Date();
    System.out.println(date.toString());

    String yyyy = String.format("%tY", date); System.out.println("year = " + yyyy);
    String MM = String.format("%tm", date);   System.out.println("month = " + MM);
    String dd = String.format("%td", date);   System.out.println("day = " + dd);
    String HH = String.format("%tH", date);   System.out.println("hour = " + HH);
    String m = String.format("%tM", date);    System.out.println("minute = " + m);
    String s = String.format("%tS", date);    System.out.println("second = " + s);
    SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:m:s ");
    System.out.println("SimpleDateFormat: " + df.format(date));

  }
}
