import java.io.*;
import java.io.FileWriter;
import java.io.IOException;
import javax.crypto.CipherOutputStream;
import java.nio.file.Path;
import java.nio.file.Files;


public class FilePractice {

  public static void main(String[] args) throws IOException {
    Path p1 = Paths.get("c:\\User\\yoshiter toyoda\\lib\\MeikaiJava\\allReview6\\kiseki.dat");
    Path p2 = file.toPath();



    FileWriter fw = new FileWriter("ffsave.dat", true);
    fw.write("A");
    fw.write("おじいちゃんとおばあちゃん\n\r");
    fw.write("もうええか・・？");
    fw.flush();
    fw.close();

    FileReader fr = new FileReader("ffsave.dat");
    System.out.println("すべてのデータを読み込みます！");

    int i = fr.read();

    while ( i != -1) {
      System.out.print( (char)i );
      i = fr.read();
    }

    fr.close();

    try( FileWriter fww = new FileWriter("php.dat", true); ){
      fww.write("おじいちゃん");
      fww.write("おじいとは");
      fww.flush();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (fww != null) {
      try{
        fww.close();
      } catch(IOException e2) {
        e2.printStackTrace();
      }
    }
  }

  FileOutputStream fos = new FileOutputStream("dat.txt");
  CipherOutputStream cos = new CipherOutputStream(fos, algo);
  cos.write(65);
  cos.write("sotojifa".getBytes());
  cos.flush();
  cos.close();


  OutputStreamWriter osw = new OutputStreamWriter(cos);

  osw.write("きゃーーーーーーーーーー");

  osw.flush();
  osw.close();

  }
}
