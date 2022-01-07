package aaa.chap04;

class Multi {
  public static void main(String[] args){
    for (int i = 1; i <= 9; i++){
      for (int j = 1; j <= i; j++) {
        System.out.printf("%3d", i * j);
      }
      System.out.println();
    }

    System.out.print("整数値:　"); int x = 4;
    System.out.print("実数:　"); double y = 43.2;
    System.out.printf("x = %3d y = %6.2f\n", x , y);

    for (int ii = 1; ii <= 4; ii++) {
        System.out.printf(String.format("%%%dd\n", ii), 5);
    }
    for (int jj = 5; jj >= 0; jj--){
      System.out.printf(String.format("%%%dd\n", jj), 6);
    }
  }
}
