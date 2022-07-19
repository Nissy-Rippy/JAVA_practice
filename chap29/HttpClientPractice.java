
import java.net.URI;
import java.net.http.*;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;

import com.fasterxml.jackson.databind.*;

import java.net.*;
import java.net.http.*;
import java.util.*;
import java.io.*;  //stream形式を利用



public class HttpClientPractice {

  public static void main(String[] args) throws Exception {
    
    URL url = new URL("https://dokojava.jp/favicon.ico");  //画像ファイルのURL
    InputStream is = url.openStream();                          //URLオープンストリームを読み取り用のストリームInputstreamに流し込む！
    OutputStream os = new FileOutputStream("dj.ico");     //出力用のストリームOutputStreamをつかいファイルに書き込こんでいく　dj.icoは保存するファイル名
    

    int i = is.read();   //int型にいったん代入する必要がある、-1を表示させるため
    while (i != -1) {
      os.write((byte)i); //outputstreamはバイト列を扱っているため、不用意だがここでint型からbyte型に一時的にキャストする必要がある
      i = is.read();     //新しくint型で読み込みここで-1が出ると処理が終了する
        }

    is.close();//空けたら占める
    os.flush();//書き込み忘れがないように書き込む！
    os.close();//空けたら占める

    Socket socket = new Socket("smtp.example.com", 60025);//ホスト名とポート番号
    OutputStream os1 = socket.getOutputStream();//このソケットの出力ストリームを返す
    InputStream  is1 = socket.getInputStream();//このソケットの入力ストリームを返す
    os1.write("name:  toyoda\r\n".getBytes());//os1にはsocketの出力ストリームが流れているのでwriteによってバイト列をストリームにながし出力することが出来る
    os1.write("age: 10".getBytes());
    os1.flush();//強制的に書き込む、残しがないように

    InputStreamReader isr = new InputStreamReader(is1);//文字を受け取るときはふつうのinputstreamよりもこっちのが早く受信することが出来る


    int ii = isr.read(); // int型にいったん代入する必要がある -1を表示させるため
    while(ii!=-1)
    {
          os.write((byte)ii); //outputstreamはバイト列を扱っているため、不用意だがここでint型からbyte型に一時的にキャストする必要がある
          i = isr.read();     //新しくint型で読み込みここで-1が出ると処理が終了する
            }


    socket.close();//inputstream も outputstreamもsocketをしめると両方閉じれる。

    String url1 = "https://api.github.com/users/miyabilink";
    
    // ①Httpclientを作る　　　　　　　　　②HttpRequestを作る　　　　　③HttpResponseを作る
    HttpClient client = HttpClient.newBuilder()
    .version(Version.HTTP_1_1)         //version
    .followRedirects(Redirect.NORMAL)  //転送先に自動訪問してくれるコード
    .build();                          //完成

    HttpRequest request = HttpRequest.newBuilder()
    .uri(URI.create(url1))                                         //URI.create     サイトのURL
    .header("Accept", "application/vnd.github.v3+json")//headerの作成
    .GET()                                                         //メソッドの設定するリクエストで
    .build();

    HttpResponse<String> response =
    //動機通信
    client.send(request, HttpResponse.BodyHandlers.ofString());  //上記で作成した clientに先程作ったリクエストをHttpsResponseに送信して文字列で読み込んでもらう

    String body = res.body();     //レスポンスを受け取る,
    int status = res.statusCode();//ステータスコードを受け取る 200 300 403 404 とか！情報

    if (status == 200) {//200は接続成功    400は失敗
      ObjectMapper mapper = new ObjectMapper();
      JsonNode root = mapper.readTree(body);//ジェイソン式の文章をreadTreeで読み取る
      String blog = root.get("blog").textValue();//読み込んだ値を入手していく
      System.out.println(blog);
    } else {
      System.out.println("ERROR: " + status);//接続失敗時の処理
    }


     }
  }

