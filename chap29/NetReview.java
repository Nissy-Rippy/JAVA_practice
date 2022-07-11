
import java.io.*;
import java.net.*;
import java.net.URL;
import java.io.FileOutputStream;

public class NetReview {
  public static void main(String[] args) throws IOException, Exception {
    URL url = new URL("https://dokojava.jp/favicon.ico");// 画像ファイルのあるURLをゲットする
    InputStream is = url.openStream();// 画像リンクisにバイト型で読み込ませる
    OutputStream os = new FileOutputStream("dj.ico");// dj.icoというファイルに出力していく＝書き込んでいく
    int i = is.read();// 書き込むためのはじめのバイト列を代入しておく
    while (i != -1) {
      os.write((byte) i);// 一文字づつバイト型にして出力していく
      i = is.read();
    }
    is.close();// 読み込むために開いたままなので占める
    os.flush();// 強制的に書き込む
    os.close();// 出力したら占める

    
  }
}
