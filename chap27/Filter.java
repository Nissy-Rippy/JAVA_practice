// package chap27;


import java.nio.file.Path;
import java.nio.file.Files;
import java.io.*;
import java.text.FieldPosition;
import java.io.File;
import javax.crypto.CipherOutputStream;
public class Filter {
  public static void main(String[] args) {

    //まずは、通常のファイル出力ストリームの作成
    FileOutputStream fos = new FileOutputStream("data.txt");
    //出力ストリームを下流にもつ暗号化ストリームを作成して接続する
    CipherOutputStream cos = new CipherOutputStream(fos, algo);
    //さらに文字バイト変換をするストリームoswを接続する
    OutputStreamWriter osw = new OutputStreamWriter(cos);
    //owsに文字を書き込めば、バイト変換＆暗号化されファイルに出力していく
    osw.write("APB");
    osw.flush();
    osw.close();


    FileReader fr = new FieldPosition("rpgsave.dat");
    BufferedReader br = new BufferedReader(fr);
    String line = null;
    //line()は次の改行の部分まで読み込んでくれている。
    while (( line = br.readLine()) != null ) {
      System.out.println(line);
    }


    Path p1 = Paths.get("rpgsave.dat");
    Path p2 = file.toPath();

    

    

                       // 戻り値
    // copy() 　　　        long
    // move()               Path
    // delete()
    // exists()             boolean
    // isDirectory()        boolean
    // size()               long
    // readAllBytes()       byte[]
    // readAllLines()       List<String>
    // readString()         String
    // new BufferedReader() BufferedReader

  }
}
