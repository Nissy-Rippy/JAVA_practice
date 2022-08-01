import java.net.*;
import java.io.*;


public class Practice {

  public static void main(String[] args) {
    URL url = new URL("https://dokojava.jp/favicon.ico");
    InputStream is = url.openStream();
    OutputStream os = new FileOutputStream("dj.ico");
    int i = is.read();
    while (i != -1) {
      os.write((byte)i);
      i = is.read();
    }
    
    is.close();
    os.flush();
    os.close();

    }
  }

