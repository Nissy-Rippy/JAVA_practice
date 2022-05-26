package chap07;
import java.util.Scanner;

class Method {
  public static void ps(char a, int b) {
    while(b-- > 0){
      System.out.print(a);
    }
  }

  public static void pss(int n) {
    for (int i = 1; i <= n; i++)
    ps('*', n);
    System.out.println();
  }
  public static void pt(int h, int w) {
    for (int i = 1; i <= h; i++) {
      ps('+', w);
      System.out.println();
    }
  }


  public static void putStar(int x) {
    while (x-- > 0) {
      System.out.print("*");
    }
  }

  public static void putSquare(int y) {
    for (int i = 1; i <= y; i++) {
      putStar(y);
      System.out.println();
    }
  }
  
  public static void putTyohoukei(int z, int v) {
    while (z-- > 0) {
      putStar(v);
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    System.out.print("正方形を作ります。何センチの正方形を作りますか？　あなたのチョイス：　");
    int vv = stdIn.nextInt();
    putSquare(vv);
    System.out.println("長方形を作ります。何センチの長方形を作ります");
    System.out.print("縦:　");   int xx = stdIn.nextInt();
    System.out.print("横:　");   int yy = stdIn.nextInt();
    putTyohoukei(xx, yy);
    }
}
