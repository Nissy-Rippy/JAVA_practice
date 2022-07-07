import java.io.*;
import java.util.*;

public class RevieFile {
  public static void main(String[] args) throws Exception {
    Writer fw = new FileWriter("pref.properties");
    Properties p = new Properties(); // プロパティファイルを読み込むための機能をインスタンス化する
    p.setProperty("aichi.capital", "名古屋");
    p.setProperty("aichi.food", "味噌カツ");
    p.store(fw, "愛知の情報");
    fw.close();//書き込んだらファイルは閉じる

    Reader fr = new FileReader("pref.properties"); //ファイルを読み込む ファイルの配置位置は同じフォルダに位置させとく同じファイルの中ではないので注意
    // Properties p = new Properties(); //プロパティファイルを読み込むための機能をインスタンス化する
    p.load(fr);//ファイルの読み込み
    String capital = p.getProperty("aichi.capital");//keyを入力する
    String food = p.getProperty("aichi.food");
    System.out.println("愛知県の首都: " + capital);
    System.out.println("愛知県の食べ物: " + food);
    fr.close();  //しっかりファイルを読み込んだ後は閉じること！！

    ResourceBundle rb = ResourceBundle.getBundle("pref");
    System.out.println(rb.getString("aichi.capital") + ":" + rb.getString("aichi.food"));
    

  }
}


