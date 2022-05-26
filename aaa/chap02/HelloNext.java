package aaa.chap02;
import java.util.Scanner;
public class HelloNext {
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);

    System.out.print("私の名前は：");
    String str = stdIn.next();
    System.out.println("こんにちは" + str + "様");

    System.out.print("あなたの年齢は:");
    int age = stdIn.nextInt();
    System.out.println("私の年齢は" + age + "です。");

    System.out.print("あなたの名前は：");
    String str1 = stdIn.nextLine();
    System.out.println("あなたの本当の名前は" + str1 + "です");

  }
}
