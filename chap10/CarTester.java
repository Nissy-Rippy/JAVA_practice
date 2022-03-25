package chap10;

public class CarTester {
  public static void main(String[] args) {
    Day d = new Day(2021,3,4);
    Car myCar = new Car("愛車", 1222, 1234, 324, 90.0, d);
    Day p = myCar.getPurchaseDay();
    System.out.println("愛車購入日: " + p);
    p.set(1222, 3, 4);
    System.out.println("愛車購入日: " + p);

    Day q = myCar.getPurchaseDay();
    System.out.println("愛車購入日: " + p);
             


  }
}
