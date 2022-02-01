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

class Person {
  public static int count;
  public String firstName;
  public String lastName;
  public int age;
  public double height;
  public double weight;

  Person(String firstName, String lastName, int age, double height, double weight) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

  public String fullName() {
    return this.firstName + " " + this.lastName;
  }

  public double bmi() {
    return this.weight / this.height / this.height;
  }

  // printDataメソッドを定義してください
  public void printData() {
    System.out.println("私の名前は" + this.fullName() + "です");
    System.out.println("年齢は" + this.age + "歳です");
    System.out.println("BMIは" + Math.round(this.bmi()) + "です");
  }

}
