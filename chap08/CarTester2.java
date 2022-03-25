package chap08;

import java.util.Scanner;

class CarTester2 {
  public static void main(String[] args) {
    Scanner stdInt = new Scanner(System.in);
    System.out.println("車のデータを入力せよ！！");
    System.out.print("名前は:　");
    String name = stdInt.next();
    System.out.print("車幅は:　");
    int width = stdInt.nextInt();
    System.out.print("高さは:　");
    int height = stdInt.nextInt();
    System.out.print("長さは:　");
    int length = stdInt.nextInt();
    System.out.print("燃料は:　");
    double fuel = stdInt.nextDouble();

    // Car myCar = new Car(name, width, height, length, fuel);

    
    while (true) {
      System.out.println("現在地(" + myCar.getX() + "," + myCar.getY() + ")　・　残り燃料:　" + myCar.getFuel());
      System.out.print("移動しますか？ [0・・NO / 1・・YES] : ");
      if (stdInt.nextInt() == 0)
        break;
      System.out.print("Xの方向の移動距離: ");
      double dx = stdInt.nextDouble();
      System.out.print("Yの方向のお移動距離: ");
      double dy = stdInt.nextDouble();
      if (!myCar.move(dx, dy))
        System.out.println("燃料が足りません");
    }
  }
}
