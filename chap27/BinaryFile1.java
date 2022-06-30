package chap27;

import java.io.*;
import java.io.FileOutputStream;
import java.io.FileInputStream;
 public class BinaryFile1 {
  public static void main(String[] args) throws IOException {
    FileOutputStream fos = 
    new FileOutputStream("rpgsave.dat", true);

    fos.write(65);//65は2進数で01000001 = Aを書き込んでることと同じである
    fos.flush();
    fos.cloes();



  }
}
