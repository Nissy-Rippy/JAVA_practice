package chap08;


public class CartTester1 {
  public static void main(String[] args) {
    Car bmw = new Car("BMW", 1660, 1500,3640, 40.0,30.0,30);
    Car march = new Car("マーチ", 1400, 2000, 3000, 30.0, 40.0, 30);

    bmw.carSpec();
    System.out.println();

    march.carSpec();

  }
}
