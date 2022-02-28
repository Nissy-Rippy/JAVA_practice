package chap17;

public class Vehicle {
  public static int counter = 0;
  private int id;
  private int fuel = 100;
  private int value;
  private int length;
  private int height;
  private int distance;
  { id = ++counter; }
  public Vehicle () { }
  public Vehicle (int length, int height, int fuel, int value) {
    this.length = length; this.height = height; this.fuel = fuel; this.value = value;
  }

  public int getFuel() { return this.fuel; }
  public int value() { return this.value; }
  public int length() { return this.length; }
  public int height() { return this.height; }
  public int distance() { return this.distance; }
  
  public void setFuel(int fuel) { this.fuel = fuel; }
  public void setDistance(int distance) { this.distance = distance; }
  public void setLength(int length) { this.length = length; }
  public void setHeight(int height) { this.height = height; }
  public void setValue(int distance) { this.distance = distance; }

  public 

  }