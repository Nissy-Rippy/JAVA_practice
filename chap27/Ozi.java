// package chap27;

import java.io.*;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import java.util.zip.GZIPOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.file.CopyOption;
import java.nio.file.Paths;

import javax.tools.FileObject;

public class Ozi {
  public static void main(String[] args) throws IOException, Exception {
    if (args.length != 2) {
      System.out.println("機動パラメーターの指定が不正です");
      
    }

    String inFile = args[0];
    String outFile = args[1];
    // FileInputStream fis = new FileInputStream(inFIle);
    // FileOutputStream fos = new FileOutputStream(outFile);

    
try(
FileInputStream fis = new FileInputStream(inFile);
FileOutputStream fos = new FileOutputStream(outFile);
BufferedOutputStream bos = new BufferedOutputStream(fos);
GZIPOutputStream gzos = new GZIPOutputStream(bos);
)
{
int i = fis.read();
while ( i != -1) {
  gzos.write(i);
  i = fis.read();
}

gzos.flush();
} catch (IOException e) {
  System.out.println("ファイル処理に失敗しました！");
}




    // // まずは、int型ではじめの一文字を代入しておく //流れとしては、読み込ましておいて書いて新しく読み込むという流れ
    // int i = fis.read();
    // while (i != -1) {// -1になるまでつづく
    //                  // outFileに1文字ずつ読み込んだ文字を,FileOutputStream()の引数に渡し記入していく
    //   fos.write(i);
    //   // そして、次の文字をまた読み込む
    //   i = fis.read();
    // }

    // fos.flush();
    // fos.close();
    // fis.close();

  }
}