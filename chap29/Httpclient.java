import java.net.*;
import java.net.http.HttpRequest;
import java.net.http.HttpClient.Version;
import java.io.*;
import java.lang.ProcessBuilder.Redirect;
import java.util.*;

public class Httpclient {
  public static void main(String[] args) {

    
    //今回はew演算子を使わないでインスタンスを作る。
    //HttpClientクラスのnewBuilderメソッド使ってインスタンスを作り各種の設定メソッドを連鎖的に呼び出す。
    HttpClient client = HttpClient.newBuilder()//インスタンスの作成
                                  .version(Version.HTTP_1_1)//HTTP1.1を使用
                                  .followRedirects(Redirect.NORMAL)//30X応答で転送先に自動訪問する
                                  .build();//立ち上げる
    HttpRequest request = HttpRequest.newBuilder()
                                     .uri(URI.create("http://example.com/movies"))//URLの設定
                                     .GET()  //メソッドしてい
                                     .build();//完成

   HttpRequest request2 = HttpRequest.newBuilder()
                                     .uri(URI.create("http://example.com/movies"))//URLの設定にはuriをつかう
                                     .header("Content-Type", "application/json") //headerの追加
                                     .header("Accept", "application/json")       //headerの追加
                                     .POST(HttpRequest.BodyPublisher.ofString(
                                      "{\"name\":\"スッキリ魔王征伐THE MOVIE\"," + "\"director\":\"minato\"}"//メソッドとボディー説明
                                     ))
                                     .build();


  HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString()); //同期方式でリクエストする
  String body = res.body();//レスポンスのボディー
  int status = res.statusCode();//レスポンスのステータスコード
  
  }
}
