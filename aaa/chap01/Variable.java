package aaa.chap01;

import java.util.Scanner;

class Variable{
public static void main(String[] args){
Scanner stdIn = new Scanner(System.in);
System.out.println("xの値: ");
int x = stdIn.nextInt();
System.out.println("yの値: ");
int y = stdIn.nextInt();

System.out.println(x - y);
System.out.println(x + y);
System.out.println(x * y);
System.out.println(x + y);

}
}
