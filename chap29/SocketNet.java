import java.net.*;
import java.net.Socket;
import java.io.*;
import java.util.*;
public class SocketNet  {

  public static void main(String[] args) throws IOException {
  Socket sock = new Socket("dokojava.jp", 80);//ホスト名(https://の後の部分のこと)とポート番号を指定してSocketクラスをインスタンス化する。
  //Socketから入力ストリームと出力ストリームを習得する。
  InputStream is = sock.getInputStream();
  OutputStream os = sock.getOutputStream();

  os.write("GET /index.html HTTP/1.0\r\n".getBytes());//HTTP要求を送信
  os.write("\r\n".getBytes());
  os.flush();

  InputStreamReader isr = new InputStreamReader(is);
  int i = isr.read();// 入力すストリームから読み取る
  while (i != -1) {
    System.out.print((char)i);
    i = isr.read();
  }
  sock.close();// 空けたら閉じる

  }

}
