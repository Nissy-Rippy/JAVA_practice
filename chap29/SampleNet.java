
import com.fasterxml.jackson.databind.ObjectMapper;//ライブラリ
import java.net.*;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import java.nio.charset.StandardCharsets;

import java.time.Duration;

/**
 * @param appid アプリケーションID
 * @param query 検索キーワード
 */


public class SampleNet {

  public static void main(String[] args) {

    // try {
      String appid = args[0];
      String query = args[1];
      System.out.println("appid: " + appid); // アプリケーションID
      System.out.println("query: " + query); // 検索キーワード

  //     // 商品を検索
  //     ResultSet rs = new ItemSearch().search(appid, query);
  //     if (rs != null) {
  //       for (ResultSet.Hit hit : rs.hits) {
  //         System.out.println("**************************************************");
  //         System.out.println("商品名: " + hit.name);
  //         System.out.println("商品説明: " + hit.description);
  //         System.out.println("キャッチコピー: " + hit.headLine);
  //         System.out.println("76×76サイズの画像URL: " + hit.image.small);
  //         System.out.println("146×146サイズの画像URL: " + hit.image.medium);
  //         System.out.println("商品URL: " + hit.url);
  //         System.out.println("価格: " + hit.price);
  //       }
  //     }
  //   } catch (Exception e) {
  //     System.out.println("エラー発生: " + e);
  //     e.printStackTrace();
  //   }
  // }

  // /**
  //  * 商品を検索する時の必要な情報。
  //  * 
  //  * @param appid アプリケーションID
  //  * @param query 検索キーワード
  //  * @return 検索結果　戻り値
  //  * @throws Exception エラー発生時のクラスをここに表示
  //  */
  // public ResultSet search(String appid, String query) throws Exception {

  //   try {
  //     // API コール用の URL を組み立てる
  //     String baseurl = "https://shopping.yahooapis.jp/ShoppingWebService/V3/itemSearch";
  //     String url = baseurl +
  //         "?query=" + URLEncoder.encode(query, StandardCharsets.UTF_8) + // 検索キーワード
  //         "&results=2"; // 検索結果2件まで
  //     System.out.println("URL: " + url);

  //     // HTTP リクエスト情報を構築させている
  //     HttpRequest req = HttpRequest.newBuilder(new URI(url))
  //         .GET()
  //         .setHeader("User-Agent", "Yahoo AppID: " + appid) // アプリケーションID
  //         .timeout(Duration.ofSeconds(10))
  //         .build();

  //     // API をコールして結果を取得
  //     HttpClient client = HttpClient.newBuilder()
  //         .version(HttpClient.Version.HTTP_1_1)
  //         .followRedirects(HttpClient.Redirect.NORMAL)
  //         .connectTimeout(Duration.ofSeconds(10))
  //         .build();
  //     HttpResponse<String> res = client.send(req, HttpResponse.BodyHandlers.ofString());
  //     String body = res.body();

  //     // レスポンスのステータスコードを出力させている
  //     int statusCode = res.statusCode();
  //     System.out.println("statusCode: " + statusCode);

  //     // ステータスコードで成功・失敗を判断
  //     switch (res.statusCode()) {
  //       case 200:
  //         // HTTP レスポンスの JSON を ResultSet クラスにマッピングさせている
  //         return new ObjectMapper().readValue(body, ResultSet.class);
  //       case 403:
  //         // エラー情報を出力させるためのコマンド
  //         ErrorResponse errorResponse = new ObjectMapper().readValue(body, ErrorResponse.class);
  //         System.out.println("エラーメッセージ: " + errorResponse.error.message);
  //         return null;
  //       default:
  //         return null;
  //     }

  //   } catch (Exception e) {
  //     throw e;
    //  }
   }
}