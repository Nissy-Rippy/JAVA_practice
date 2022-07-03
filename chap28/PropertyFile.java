import java.io.*;
import java.util.*;
import java.util.Properties;
import java.util.ResourceBundle;

public class PropertyFile {
  /**
   * @param args
   * @throws Exception
   */
  public static void main(String[] args) throws Exception {
    //  ClassPath cp = new ClassPath();
    System.out.println(System.getProperty("java.class.path"));

    Writer fw = new FileWriter("c:\\Users\\yoshiteru toyoda\\lib\\rpgdata.properties");
    Properties pw = new Properties();
    pw.setProperty("heroName", "あやか");
    pw.setProperty("heroHp", "43");//データのセット
    pw.setProperty("heromp", "46");
    pw.store(fw, "勇者の情報");    //ファイルへ書き出す  第二引数はファイルの先頭にコメントとして出力される！
    fw.close();


    // try (FileWriter f = new FileWriter("rpgdata.properties")) {
    //   f.write("heroName" "おじいちゃん":"heroHp""54");
  

    // }
    // Reader fr = new FileReader("rpgdata.properties");

    Reader fr = new FileReader("c:\\Users\\yoshiteru toyoda\\lib\\rpgdata.properties");//絶対パス
    Properties p = new Properties();//Propertyクラスのインスタンスを作る
    p.load(fr);//loadメソッドを使ってファイル内容を読み取る
    String name = p.getProperty("heroName");//loadで入手したデータをget
    String strHp = p.getProperty("heroHp");//"herohp"はキーである
    int hp = Integer.parseInt(strHp);//文字列をデータ型に変換して戻す!

    System.out.println("勇者の名前: " + name);
    System.out.print("勇者のHP" + hp);
    fr.close();

    ResourceBundle rb = ResourceBundle.getBundle("toyoda.AppData.Roaming.Code.User.workspaceStorage.256ab33fa896e82e36fc0c50a1c639cb.redhat.java.jdt_ws.jdt.ls-java-project.bin.lib.rpgdata");//.propertiesは,書かない
    
  }

}
