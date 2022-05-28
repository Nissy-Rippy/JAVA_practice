package chap10;

import java.util.Scanner;

public class CarTester2 {
  public static void main(String[] args) {
    
    Scanner stdIn = new Scanner(System.in);
    Day dd = new Day(1,2,4);
    Car car1 = new Car("べんつ", 1999, 1222, 1234, 49.0, new Day(1,4,5) );

    System.out.println("購入日" + car1.getPurchaseDay().toString());
    System.out.print("購入年： "); int x = stdIn.nextInt();
    System.out.print("購入月： "); int y = stdIn.nextInt();
    System.out.print("購入日： "); int z = stdIn.nextInt();

    Car car = new Car("name", 23, 4444, 656564, 4543, new Day(x,y,z));
    System.out.println("購入日" + car.getPurchaseDay());

  }
}
