package aaa.chap06;
import java.util.Scanner;
import java.util.Random;

 class Janken {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    Random rando = new Random();
    String[] hands = {"グー", "チョキ", "パー"};
    int retry;
    do{
      int comp = rando.nextInt(3);
      int user;
      do{
        System.out.print("じゃんけんぽん: ");
        for (int i = 0; i < hands.length; i++) {
          System.out.printf("(%d)%s", i, hands[i]);
          System.out.print(": ");
        }
          user = stdIn.nextInt();
        } while(user < 0 || 2 < user);
        System.out.printf("私は、%sでコンピューターは、%sです。\n", hands[user], hands[comp]);
        int judge = (user - comp + 3) % 3;
        switch (judge) {
          case 0: System.out.println("引き分けです");     break;
          case 1: System.out.println("あなたの負けです"); break;
          case 2: System.out.println("あなたの勝ちです"); break;
        }
        do{
        System.out.print("もう一度続けますか？:　(0)いいえ　(1)　はい　入力番号：　");
        retry = stdIn.nextInt();
        } while (retry != 0 && retry != 1);
      } while (retry == 1);
    }
  }
