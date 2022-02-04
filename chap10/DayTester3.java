package chap10;

public class DayTester3 {
  private int year = 1;
  private int month = 1;
  private int date = 1;

  public DayTester3() {}
  public DayTester3(int year){ this.year = year;}
  public DayTester3(int year, int month) {this(year); this.month = month;}
  public DayTester3(int year, int month, int date) {this(year,month); this.date = date;}
  public DayTester3(DayTester3 d) { this(d.year, d.month, d.date); }
}
