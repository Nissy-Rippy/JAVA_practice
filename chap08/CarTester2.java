package chap08;

import java.util.Scanner;

class CarTester2 {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    System.out.println("車のデータを入力せよ！！");
    System.out.print("名前は:　");
    String name = stdIn.next();
    System.out.print("車幅は:　");
    int width = stdIn.nextInt();
    System.out.print("高さは:　");
    int height = stdIn.nextInt();
    System.out.print("長さは:　");
    int length = stdIn.nextInt();
    System.out.print("燃料は:　");
    double fuel = stdIn.nextDouble();

    Car myCar = new Car("toyota", 30, 50, 100, 0.0, 0.0, 200);
    myCar.carSpec();
    
    while (true) {
      System.out.println("現在地(" + myCar.getX() + "," + myCar.getY() + ")　・　残り燃料:　" + myCar.getFuel());
      System.out.print("移動しますか？ [0・・NO / 1・・YES] : ");
      if (stdIn.nextInt() == 0)
        break;
      System.out.print("Xの方向の移動距離: ");
      double dx = stdIn.nextDouble();
      System.out.print("Yの方向のお移動距離: ");
      double dy = stdIn.nextDouble();

      if (!myCar.move(dx, dy))
        System.out.println("燃料が足りません");
    }
  }
}
