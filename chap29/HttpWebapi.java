import java.net.*;
import java.util.Scanner;
import java.io.*;


public class HttpWebapi {
  public static void main(String[] args) throws Exception, IOException {
    System.out.println("検索したい用語を入力してください！");
    String keyWord = new Scanner(System.in).nextLine();
    URL google = new URL("https://google.com/search?q=" + keyWord);
    InputStream is = google.openStream();//InputStreamで入手する  URLを入手したら、openStream()で受け取った値をInputStreamに渡す
    URL bookSearch = new URL("https://iss.ndl.go.jp/api/sru?operation=searchRetrieve&query=isbn=4295007803");
    InputStream is2 = bookSearch.openStream();
    System.out.print(is2);

  }
}
