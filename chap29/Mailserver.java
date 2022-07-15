
import java.net.*;
import java.io.*;

public class Mailserver {

  public static void main(String[] args) throws IOException, Exception {
    // 空想のサイトをイメージして行う
    Socket sock = new Socket("smtp.example.com", 60025);// hostにホスト名、portに番号
    OutputStream os = sock.getOutputStream();// 親クラスのOutputStreamにソケットクラスの情報を送る
    os.write("HELO smtp.example.com\r\n".getBytes());// 改行コードは、\r\nにしている
    os.write("MAIL FROM: asaka".getBytes());// getBytes で文字列をバイト列に変換する
    os.write("From: asaka@example.com".getBytes());
    os.flush();
    os.close();

  }
}
