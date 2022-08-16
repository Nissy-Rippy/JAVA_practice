import java.net.URI;
import java.net.http;
import java.net.http.HttpClient.*;
import com.fasterxml.jackson.databind.*;

import java.net.*;
import java.io.*;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest;
import java.net.http.HttpClient.Version;

public class Test {
  
  
  
  public static void main(String[] args) throws IOException {
    
    String url = "https://api.github.com/users/miyabilink";

    HttpClient client3 = HttpClient.newBuilder()
    .version(Version.HTTP_1_1)
    .followRedirects(Redirect.NORMAL)
    .build();

    HttpRequest request3 = HttpRequest.newBuilder()
    .uri(URI.create(url))
    .header("Conten-Type:", "application/json")
    .header("Accept: ", "application/vnd.github.v3 + json")
    .header("User-Agent: ", "miyabilink")
    .GET()
    .build();

    HttpResponse<String> response3 = client3.send(request3, 
    HttpResponse.BodyHandlers.ofString() );
    String body3 = res.body();
    int status3 = res.statusCode();

    if (status3 == 200) {
      ObjectMapper mapper = new ObjectMapper();
      JsonNode root = mapper.readTree(body);
      String blog = root.get("blog").texValue();
      System.out.println(blog);
    } else {
      System.out.println("ERROR: " + status3);
    }




    URL url = new URL("https://dokojava.jp/favicon.ico");
    InputStream is = url.openStream();
    OutputStream os = new FileOutputStream("dj.ico");
    int i = is.read();

    while (i != -1 ){
      os.write((byte)i);
      i = is.read();
    }

    os.close();
    os.flush();
    is.close();

    Socket sock = new Soket("smtp.example.com", 60025);
    InputStream is1 = sock.getInputStream();
    OutputStream os1 = sock.getOutputStream();
    os1.write("HELO smtp.example.com\n".getBytes());
    os1.write("MAIL FROM: asaka@example.com\n".getBytes());
    os1.write("RCPT TO: minato@example.com\n".getBytes());
    os1.write("Data \n".getBytes());
    os1.write("FROM: aska@gmail.comdd\n".getBytes());
    os1.write("SUBJECT: Please send me your RPG\n".getBytes());

    os1.flush();
    os1.close();
    is1.close();

  



  }
}
