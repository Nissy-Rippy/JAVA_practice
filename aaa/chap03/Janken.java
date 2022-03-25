package aaa.chap03;

import java.util.Scanner;
import java.util.Random;

class Janken {

  public static void main(String[] args){

    Scanner stdIn = new Scanner(System.in);
    Random rand = new Random();
    
    System.out.println("ジャンケンを開始します");
    System.out.println("0: グー、1: チョキ、2: パー いずれより選んでください");
    
    int yourHand = stdIn.nextInt();
    while (yourHand < 3 && yourHand > 0){
    String win = switch(yourHand){
                case 0 -> "グー";
                case 1 -> "チョキ";
                case 2 -> "パー";
                default -> "もう一度入力してください";
                };
    System.out.print("あなたは: ");

  }
}
}