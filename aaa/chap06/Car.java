package aaa.chap06;

class Car {
  private String name;
  private String color;
  private int distance = 0;
  private int fuel = 100;

  Car(String name, String color) {
    this.name = name;
    this.color = color;
  }

  public void printData() {
    System.out.println("名前：" + this.name);
    System.out.println("色：" + this.color);
    System.out.println("走行距離：" + this.distance + "km");
    System.out.println("ガソリン量：" + this.fuel + "L");
  }

  public void run(int carMeter) {
    if (carMeter >= this.fuel) {
      System.out.println("ガソリンが足りません");
    } else {
      this.distance += carMeter;
      this.fuel -= carMeter;
    }
    System.out.println("走行距離：" + this.distance + "km");
    System.out.println("ガソリン量：" + this.fuel + "L");
  }

  public void charge(int amount) {
    System.out.println(amount + "L給油します");
    if (amount + this.fuel >= 100) {
      System.out.println("満タンまで給油します");
      this.fuel = 100;
    } else if (0 >= amount) {
      System.out.println("給油できません");
    } else {
      this.fuel += amount;
    }
    System.out.println("ガソリン量：" + this.fuel + "L");
  }
}
