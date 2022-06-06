package chap16;
 
public class Test2 {

  static void printStringArray(String[] s) {
    for (int i = 0; i < s.length; i++)
      System.out.println("No." + i + " = " + s[i]);
  }
  public static void main(String[] args) {
    String[] hands = {"グー", "チョキ", "パー"};
    System.out.println("コマンドラインの引数");
    printStringArray(args);
    System.out.println("ジャンケンのて");
    printStringArray(hands);
  }
  
}
