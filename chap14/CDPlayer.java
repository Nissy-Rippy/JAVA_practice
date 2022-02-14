package chap14;

public class CDPlayer implements Player {
  @Override public void play() {
    System.out.println("CD再生終了");
  }
  @Override public void stop() {
    System.out.println("CD再生終了");
  }
public void cleaning() {
   System.out.println("**ヘッドをクリーニングしました！！");
  }
  
}
