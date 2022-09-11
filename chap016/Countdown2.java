  
import java.util.*;
//カウントダウンするときに必要なインポート！
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;

public class Countdown2 {//implements Runnable　　と書いてrunをオーバーライドするという手もある！こうすれば継承しながらでも別のスレッドを実装できる！

  public static void main(String[] args) {

    System.out.println("止めるには「STOP」してください！");
    System.out.println("カウントダウンを開始します！！");

    /**
     * こっちの方は、Treadを継承してそのうちrunメソッドをオーバライドするやり方！
     * インスタンスを生成した後に,Threadのもつstartメソッドを使って別スレッドにて動作開始！
     */

    PrintingThread t = new PrintingThread();
    t.start();

    /** これが、Runnableを使ったやり方！
     * 　これなら、継承もしながらrunをオーバライドしてThreadのコンストラクタに代入してあげることもできる。
     */
    // new Tread(new PrintingThread2()).start();

    String input = new Scanner(System.in).nextLine();

    /**
     * Stopと入力されたら動作中の状態を停止することができる
     * stopReq.set()の中身を  trueとfalseから変更することによって、発動することができる
     */

    if (input.equals("STOP")){
      t.stopReq.set(true);
    }
    try {
      t.join();
    } catch (InterruptedException e) { ; }

    System.out.println("入力文字列: " + input);
    System.out.println("停止処理は未作成です！");

  }
}
