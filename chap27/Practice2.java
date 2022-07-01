package chap27;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.file.CopyOption;
import java.nio.file.Paths;

import javax.tools.FileObject;


public class Practice2 {

  // public static Path copy(Path source, Path target, CopyOption options) throws IOException {

  //   try{
  //     Files.copy(p1, p2, REPLACE_EXISTING);
  //   } catch (IOException e) {
  //     System.out.println(e);
  //   }
  // }
  public static void main(String[] args) throws IOException, Exception {

    String inFIle = args[0];
    String outFile = args[1];
    FileInputStream fis = new FileInputStream(inFIle);
    FileOutputStream fos = new FileOutputStream(outFile);

    //まずは、int型ではじめの一文字を代入しておく　　//流れとしては、読み込ましておいて書いて新しく読み込むという流れ 
    int i = fis.read();
    while (i != -1) {//-1になるまでつづく
      //outFileに1文字ずつ読み込んだ文字を,FileOutputStream()の引数に渡し記入していく
      fos.write(i);
      //そして、次の文字をまた読み込む
      i = fis.read();
    }

    fos.flush();
    fos.close();
    fis.close();


    // Path p1 = Paths.get("rpgsave.dat");
    // Path p2 = Paths.get("F.txt");

    // try {
    //   Files.copy(p1, p2, REPLACE_EXISTING);
    // } catch (IOException e) {
    //   System.out.println(e);
    // }












  }
}
