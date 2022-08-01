import java.net.http.*;
import java.net.api.*;
import java.net.http.HttpClient;
import java.util.ResourceBundle;
import java.net.*;
import java.io.*;
import java.lang.Runtime.Version;


public class Mail {

  public static void main(String[] args) {
    Socket socket = new Socket("smtp.example.com", 60025);
    InputStream is = socket.getInputStream();
    OutputStream os = socket.getOutputStream();
    os.write("HELO smtp.example.com\r\n".getBytes());
    os.write("MAIL FROM: asaka@example.com\r\n".getBytes());
    os.flush();
    os.close();
    socket.close();

    String gitURL = "https://docs.github.com/ja/rest/reference";
    String api = "https://api.github.com/users.miyabilink";

    HttpsClient client = HttpClient.newBuilder()
    .version(Version.HTTP_1_1)
    .followRedirects(Redirect.NORMAL)
    .build();

    HttpRequest request = HttpRequest.newBuilder()
    .uri(URI.create("url"))
    .header("Accept", "application/vnd.github,v3 + json")
    .GET()
    .build();

    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
    String body = res.body();
    int status = res.statusCode();

    if (status == 200) {
      System.out.println("接続成功");
      ObjectMapper mapper = new ObjectMapper();
      JsonNode root = mapper.readTree(body);
      String blog = root.get("blog").textValue();
      System.out.println(blog);
    } else if(status == 400) {
      System.out.println("接続失敗！！");
      System.out.println("ERROR : " + status);
      System.exit(1);
    }




  }
}
