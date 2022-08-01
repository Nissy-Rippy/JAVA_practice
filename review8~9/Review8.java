import java.io.*;
import java.net.*;


public class Review8 {
  public static void main(String[] args) throws Exception {
    try {
      URL url = new URL("http://style.potepan.com");
      InputStream is = url.openStream();
      InputStreamReader isr = new InputStreamReader(is);
      int i = isr.read();

      while (i != -1) {
        System.out.print((char)i);
        i =isr.read();
      }
      isr.close();

    } catch (IOException e) {
      e.printStackTrace();
    }

    Socket socket = new Socekt("dokojava.jp", 80);
    InputStream is = socket.getInputStream();
    OutputStream os = socket.getOutputStream();

    os.write("GET /index.html HTTP/1.0\r\n".getBytes());
    os.write("\r\n".getBytes());//バイト列に変換して出力する
    os.flush();
    os.close();
    InputStreamReader isr = new InputStreamReader(is);
    int ii = isr.read();
    while (ii != -1) {
      System.out.print((char)ii);
      ii = isr.read();
    }
    socket.close();

    // int i = is.read();//読み取ったものを代入している
    // os.write("HELLO");//書き込んでいく！

    socket.close();

    ServerSocekt svsocket = new ServerSocket(39648);
    Socket sock = svsocket.accept();
    System.out.println(sock.getInetAddress() + "から接続");
    sock.getOutputStream().write("WELCOME".getBytes());
    sock.getOutputStream().flush();
    sock.close();

    

  }
}
