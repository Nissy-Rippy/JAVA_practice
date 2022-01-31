package aaa.chap06;
import java.util.Scanner;

class Person1main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("何人分の情報を入力しますか：");
    int num = scanner.nextInt();
    int max = 0;
    int sum = 0;
    for (int i = 0; i < num; i++) {
      System.out.println(num + "人目");
      System.out.print("名前：");
      String firstName = scanner.next();
      System.out.print("名字: ");
      String lastName = scanner.next();
      System.out.print("年齢：");
      int age = scanner.nextInt();
      System.out.print("身長(m)：");
      double height = scanner.nextDouble();
      System.out.print("体重(kg)：");
      double weight = scanner.nextDouble();
      Person.printData(firstName, lastName, age, height, weight);
      if (max < age) {
        max = age;
      }
      sum += age;
      System.out.println("最高年齢は" + max + "歳です");
    }
    double ave = sum / num;
    System.out.println("平均年齢は" + ave + "歳です");

  }
}
