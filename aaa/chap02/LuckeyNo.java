package aaa.chap02;
import java.util.Random;
class LuckeyNo {
  public static void main(String[] args){
    Random rand = new Random();

    int num = rand.nextInt(10);
    System.out.println("今日のラッキーナンバーは" + num + "です。");


  }
}


// rand.nextInt();
// rand.nextDouble();
// rand.nextInt(8);
// rand.nextLong();
// rand.next.Float();
// rand.nextBoolean();