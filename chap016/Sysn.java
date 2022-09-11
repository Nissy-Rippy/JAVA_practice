public class Sysn {

  public synchronized void methodA() {
    System.out.println("他のスレッドを一旦止めてこのメソッドを動かす！");

    }

  public void methodB() {
      synchronized (this) {
        System.out.println("ioajf");
      }
  }

  public static void main(String[] args) throws Exception {
    Thread tt = new PrintingThread();
    tt.start();
    System.out.println("こんにちは");
    
    synchronized(tt) {
      tt.wait(3000);
      System.out.println("やほ！");
    }

    System.out.println("さようなら");
    synchronized (tt) {
      // tt.wait(20);   tt.wait(); 率い数なしでwaitを使うと　notifyAll()のメソッドを使うまでウェイトセットにて待機することになる！
      System.out.println("やぴ！");
      tt.notifyAll(); //この段階で引数なしのwaitを使った場合はここで戻ってくるのである!!!

      //notifyなどの利用は推奨されていないので極力notifyALLを使おう！


    }
    tt.join();
    System.out.println("おやすみー！");
    synchronized (tt) {
      System.out.println("いやああ");
    }
  }
}
