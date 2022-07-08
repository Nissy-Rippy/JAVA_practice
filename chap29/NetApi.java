import java.net.*;
import java.io.*;

public class NetApi {
  public static void main(String[] args) throws IOException, Exception, MalformedURLException {

    URL url = new URL("https://dokojava.jp");// 引数一つだとString型のコンストラクタが用意されている。
    InputStream is = url.openStream();// InputStream型で返す,InputStreamは、大体親のクラスでよく使われる
    InputStreamReader isr = new InputStreamReader(is);//

    int data = isr.read();// read()を呼び出して。ストリームからⅠバイトずつ情報を取り出す。初めの一文字を代入しておく
    while (data != -1) {
      System.out.print((char) data);// print で横一列に表示！！！char型にキャスティﾝグして文字列に変換、する -1はcharで表せないためデータ型で受け取るしかないのである。
      data = isr.read();// そしてまた、新しい情報を代入する
    }
    isr.close();// 読み込むんだらしっかり最後は閉じる。

  }
}
