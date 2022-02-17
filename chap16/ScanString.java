package chap16;
import java.util.Scanner;

public class ScanString {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    System.out.print("文字列ｓ");
    String s = stdIn.next();
    for (int i = 0; i < s.length(); i++) {
      System.out.println("s[" + i + "] = " + s.charAt(i));
    }
  }
  StringBuilder s2 = new StringBuilder("ABC");
//   s2.append("DEF"); s2.append("ofofo");
//   s2.insert(4, 3.12); s.insert(3, 432);
//   s2.delete(1, 4); 1~3 s.delete(3, 6); 3-5


}
