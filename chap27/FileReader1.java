package chap27;

import java.io.*;

public class FileReader1 {
  public static void main(String[] args) throws IOException {

    FileReader fr = new FileReader("rpgsave.dat");
    System.out.println("全てのデータを読み込んでいます！");

    int i = fr.read();     //読み込む
    while (i != -1) {      //読み込めなくなったら-1を返すようにしている。そのため、char型ではダメでint型で受け取っている。
      char c = (char) i;   //キャストをしないといけない
      System.out.print(c); //char型で返す
      i = fr.read();       //
    }

    System.out.println("ファイルの末尾に到達しました！");
    fr.close();

  }
}
