package chap29;


import java.net.ServerSocket;//通信を待ち受けるときに必要なクラス
import java.net.*;

public class ServerSocket3 {

  public static void main(String[] args) throws Exception {
    System.out.println("起動完了");
    ServerSocket svSock = new ServerSocket(39648);//port 39648でデータを待ち受ける 待ち受けポート
    Socket sock = svSock.accept();//accept で呼び出すと誰かから接続されるまで待ち続ける
    System.out.println(sock.getInetAddress() + "からの接続");//getInetAddress
    sock.getOutputStream().write("WELCOME".getBytes());//文字列をバイト型に変換して出力する
    sock.getOutputStream().flush();//強制的に出力する
    sock.close();//Fileを閉じる
  }
}
