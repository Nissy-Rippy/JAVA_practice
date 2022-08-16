import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpClient.Redirect;
import java.net.http.HttpClient.Version;
import java.net.Socket;
import java.net.*;
import java.net.ServerSocket;
import java.io.Exception;


public class Url {
  public static void main(String[] args) throws IOException {

    HttpClient client = HttpClient.newBuilder()
    .version(Version.HTTP_1_1)
    .followRedirects(Redirect.NORMAL)
    .build();

    HttpRequest request = HttpRequest.newBuilder()
    .uri(URI.create("http://example.com/movies"))
    .GET()
    .build();

    HttpRequest request2 = HttpRequest.newBuilder()
    .uri(URI.create("http://example.com/movies"))
    .header("Content-Type", "application/json")
    .header("Accpet", "application/json")
    .Post(HttpRequest.BodyPublisher.ofString(
      "{\"name\": \"スッキリ魔王征伐 THE MOVIE\", "
    + " \"director\": \"minato\"}"
    ))
    .build();

    HttpResponse<String> response = client.send(request2,
    HttpResponse.BodyHandlers.ofString());
    
    String body = res.body();
    int status = res.statusCode();






    System.out.println("検索したい用語を入力してください");
    String keyword = new Scanner(System.in).nextLine();
    URL google = new URL("https://google.com/search?q=" + keyword);
    InputStream oois = google.openStream();

    int iff = oois.read();
    while (iff != -1){
      System.out.print((char)iff);
      iff = oois.read();
    }
    oois.close();



    System.out.println("機動完了");
    ServerSocket svsock = new ServerSocket(39648);
    Socket sockett = svsock.accept();
    System.out.println(sockett.getInetAddress() + "から接続");
    sockett.getOutputStream().write("WLECOME".getBytes());
    sockett.getOutputStream().flush();
    URL url = new URL("https://dokojava.jp");
    InputStream is = url.openStream();
    InputStreamReader isr = new InputStreamReader(is);
    int data = isr.read();

    while (data != -1 ){
      System.out.print((char)data);
      data = isr.read();
    }
    isr.close();

    Socket sock = new Socket("dokojava.jp", 80);
    InputStream is2 = sock.getInputStream();
    OutputStream os = sock.getOutputStream();

    int i2 =is2.read();
    os.write("heroo");
    sock.close();


    Socket socket = new Socket("dokojava.jp", 80);
    InputStream is1 = socket.getInputStream();
    OutputStream os1 = socket.getOutputStream();
    os1.write("GET /index.html/ HTTP/1.0\r\n".getBytes());
    os1.write("\r\n".getBytes());
    os1.flush();

    InputStreamReader isr3 = new InputStreamReader(is1);

    int x = isr3.read();
    while (x != -1) {
      System.out.println((char)x);
      x = isr3.read();
    }
    socket.close();


  }
}
