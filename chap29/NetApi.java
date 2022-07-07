import java.net.http.*;
import java.net.spi.*;


public class NetApi {
  public static void main(String[] args) {
     URL URL1 = new URL("https://dokojava.jp");//引数一つだとＳtring型のコンストラクタが用意されている。
     InputStream is = url.openStream();//InputStream型で返す
     int data = is.read();//read()を呼び出して。ストリームからⅠバイトずつ情報を取り出す。
  }
}
