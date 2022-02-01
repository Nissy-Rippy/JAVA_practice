import java.util.Scanner;

public class chpa07 {
  
  public static void putStars(int n) {
    while(n-- > 0) {
      System.out.print("*");
    }
  }
  public static void puttStars(char i, int y) {
    while (y-- > 0) {
      System.out.print(i);
    }
  }
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
       System.out.print("左直角三角形を作ります。段数は：　");
    int xx = stdIn.nextInt();

    for (int i = 1; i <= xx; i++) {
      putStars(i);
      System.out.println();
    }
    System.out.print("右直角三角形を作ります。段数は：　");
    int yy = stdIn.nextInt();

    for (int i = 1; i <= yy; i++) {
      puttStars(' ', yy - i);
      puttStars('+', i);
      System.out.println();

    }

  }
}
