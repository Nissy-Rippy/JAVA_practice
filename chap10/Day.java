package chap10;

public class Day {

  public static int counter = 0;

  private int year;
  private int month;
  private int date;
  private int id;

  // static {counter = 4 + 5; }
  //        {id = ++counter; }
   static { counter = 4 + 4; }  //初期子　システムではじめの一回のみ行われる機能
          { id = ++counter; }   //インスタンス初期　新しくインスタンスができるたびに行われるコード

  Day() { set(1,1,1); }
  Day(int year) { set(year, 1, 1); }
  Day(int year, int month) { set(year, month, 1); }
  Day(int year, int month, int date){ set(year, month, date); }
  Day(Day d) { set(d.year, d.month, d.date); }
  
  public int getYear() {return this.year;}
  public int getMonth() {return this.month;}
  public int getDate() {return this.date;}
  public void setYear(int year) {this.year = year;}
  public void setMonth(int month) {this.month = month;}
  public void setDate(int date) {this.date = date;}

  public void set(int year, int month, int date) {
    this.year = year;
    this.month = month;
    this.date = date;
  }

}
