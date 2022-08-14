import java.io.*;

public class BiFile {
  public static void main(String[] args) throws IOException {


    FileOutputStream fos = new FileOutputStream("kiseki.dat", true);
    fos.write(65);
    fos.write("おじいちゃんは言いました".getBytes());
    fos.flush();
    fos.close();

    FileInputStream fis = new FileInputStream("kiseki.dat");
    InputStreamReader isr = new InputStreamReader(fis);
    int i = isr.read();
    
    while (i != -1){
      System.out.print((byte)i);
      i = isr.read();
    }
    isr.close();

  }
}
