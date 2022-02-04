package chap10;

public class Car {
  private String name;
  private int width;
  private int height;
  private int length;
  private double x;
  private double y;
  private double fuel;
  private Day purchaseDay;

  public Car(String name, int width, int height, int length, double fuel, Day purchaserDay) {
    this.name = name;
    this.width = width;
    this.length = length;
    this.fuel = fuel; x = y = 0.0;
    this.purchaseDay = new Day(purchaseDay);
    }
    public double getX() { return x; }
    public double getY() { return y; }
    public double getFuel() { return fuel; }

    public Day getPurchaseDay() {
      return new Day(purchaseDay); 
    }

}
