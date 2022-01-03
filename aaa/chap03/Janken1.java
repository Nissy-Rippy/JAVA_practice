package aaa.chap03;
import java.util.Scanner;
import java.util.Random;

class Janken1 {

  public static void main(String[] args){

    Scanner stdIn = new Scanner(System.in);
    Random rand = new Random();
    
    System.out.println("ジャンケンを開始します");
    System.out.println("0: グー、1: チョキ、2: パー いずれより選んでください");
    
    int yourHand;
    String you;
    do {  
          yourHand = stdIn.nextInt();      
          you = switch(yourHand){
                case 0 -> "グー";
                case 1 -> "チョキ";
                case 2 -> "パー";
                default -> "もう一度入力してください";
              };
      if (yourHand > 2 || yourHand < 0)
      System.out.println(you);
     } while(yourHand > 2 || yourHand < 0);

     int comHand = rand.nextInt(3);

     String com = switch(comHand) {
       case 0 -> "グー";
       case 1 -> "チョキ";
       case 2 -> "パー";
       default -> "もう一度入力してくださ";
     };
     String judge ;
     if (yourHand == 0) {
          if (comHand == 0){
            System.out.println("あいこ");
          } else if (comHand == 1){
            System.out.println(("勝ち"));
            }else{
            System.out.println("負け");
          }
        } else if (yourHand == 1) {
          if (comHand == 0){
            System.out.println("負け");
          } else if (comHand == 1) {
            System.out.println("引き分け");
          } else {
            System.out.println("勝ち");
          }
        } else {
          if (comHand == 0) {
            System.out.println("勝ち");
          } else if (comHand == 1){
            System.out.println("負け");
          } else {
            System.out.println("あいこ");
          }
        
        };

        System.out.println("あなたの出した手は" + you + "コンピューターの出した手は" + com + "よって結果は" + judge + "である！！");

       

  }
}
