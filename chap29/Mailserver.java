
import java.net.*;
import java.io.*;


public class Mailserver {
 
  public static void main(String[] args) throws IOException, Exception {
    Socket sock = new Socket("smtp.example.com",60025);
    OutputStream os = sock.getOutputStream();
    os.write("HELO smtp.example.com\r\n".getBytes());
    os.write("MAIL FROM: asaka".getBytes());
    os.write("From: asaka@example.com".getBytes());
    os.flush();
    os.close();

  }
}
