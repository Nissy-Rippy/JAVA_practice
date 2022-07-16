import java.net.*;
import java.io.*;
import java.net.URL;
import java.net.http.*;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Redirect;
import java.net.http.HttpClient.Version;

import com.fasterxml.jackson.databind;


public class NetApi {
  /**
   * @param args
   * @throws IOException
   * @throws Exception
   * @throws MalformedURLException
   */
  public static void main(String[] args) throws IOException, Exception, MalformedURLException {

    URL url = new URL("https://dokojava.jp");// 引数一つだとString型のコンストラクタが用意されている。
    InputStream is = url.openStream();// InputStream型で返す,InputStreamは、大体親のクラスでよく使われる
    InputStreamReader isr = new InputStreamReader(is);//テキストの読み込みの際はInputStreamReaderのが早く読み込みをすることができるのでここで利用している

    int data = isr.read();// read()を呼び出して。ストリームからⅠバイトずつ情報を取り出す。初めの一文字を代入しておく
    while (data != -1) {
      System.out.print((char) data);// print で横一列に表示！！！char型にキャスティﾝグして文字列に変換、する -1はcharで表せないためデータ型で受け取るしかないのである。
      data = isr.read();// そしてまた、新しい情報を代入する
    }
    isr.close();// 読み込むんだらしっかり最後は閉じる。


    //まずURLを変数に代入しておく
    String url2 = "https://api.github.com/suers/miyabilink";
    //クライアントの作成
    HttpClient client = HttpClient.newBuilder()
                                  .version(Version.HTTP_1_1)//version
                                  .followRedirects(Redirect.NORMAL)//ここの意味は
                                  .build();// 作成

     //リクエストの作成                             
    HttpRequest request = HttpRequest.newBuilder()
                                     .uri(URI.create(url2))//uriの作成
                                     .header("Accept", "application/vnd.github.v3+json")//headerにnameとvalueを作成
                                     .GET()//メソッドの方法
                                     .build();//作成
   
   HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());//引数にHttpRequestと
   String body = res.body();

   int status = res.statusCode();//statusコードをここで受け取っておく

   if (status == 200) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode root = mapper.readTree(body);
    String blog = root.get("blog").textValue();
    System.out.println(blog);
   } else {
    System.out.println("ERROR: " + status);
   }


  }
}
