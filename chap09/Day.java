package chap09;

public class Day {
  private int year;
  private int month;
  private int date;

  Day (int year, int month, int date) {
    this.year = year;
    this.month = month;
    this.date = date;
  }
  public int getYear() {return this.year; }
  public int getMonth() {return this.month; }
  public int getDate() {return this.date; }

  public void setYear(int year) { this.year = year; }
  public void setMonth(int month) { this.month = month; }
  public void setDate(int date) { this.date = date; }
  
  public void set(int year, int month, int date) {
   this.year = year;
   this.month = month;
   this.date = date;
}
public int dayOfWeek() {
  int y = year;
  int m = month;
  if (m == 1 || m == 2) {
    y--;
    m += 12;
  }
  return (y + y / 4- y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
}
}
