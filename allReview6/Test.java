import java.io.InputStream;
import java.io.OutputStream;
import java.io.*;
import java.io.FileInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.nio.file.*;
import java.util.zip.GZIPOutputStream;

public class Test {
  
  
  
  public static void main(String[] args) {


    try (
      FileInputStream fis1 = new FileInputStream(inFIle);
      FileOutputStream fos1 = new FileOutputStream(outFile);
      BufferedOutputStream bos1 = new BufferedOutputStream(fos1);
      GZIPOutputStream gzos = new GZIPOutputStream(bos);
    ){
      int o = fis1.read();

      while (o != -1 ){
        gzos.write(o);
        o = fis1.read();
      }
      gzos.flush();
    } catch (IOException e) {
      e.printStackTrace();
    }





    // Path p1 = Paths.get("from.dat");
    // p1.copy("to.dat");
    // Path p2 = ("from.dat").toPath();
    // p2.copy("to.dat");

    Files.copy(Paths.get(args[0], Paths.get(arg[1])));


    
    FileInputStream fis = new FileInputStream("from.dat");
    FileOutputStream fos = new FileOutputStream("to.dat");

   BufferedInputStream bis = new BufferedInputStream(fis);
   BufferedOutputStream bos = new BufferedOutputStream(fos);

   int i = bis.read();

   while (i != -1 ) {
    bos.write(i);
        i = bis.read();
   }

   fos.flush();
   fos.close();
   fis.close();








  }
}
