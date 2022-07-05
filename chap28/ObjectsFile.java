import java.io.*;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

public class ObjectsFile {
  public static void main(String[] args) throws IOException, Exception {
    Hero hero1 = new Hero("ミナト", 74, 18);
    FileOutputStream fos = new FileOutputStream("rpgsave.dat");
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    oos.writeObject(hero1);//インタンスから　バイト列に変換するhero1を
    oos.flush();
    oos.close();
    //Fileからインスタンスを復元していく
    FileInputStream fis = new FileInputStream("rpgsave.dat");
    ObjectInputStream ois = new ObjectInputStream(fis);
    Hero hero2 = (Hero)ois.readObject(); //ここでバイト列からインスタンスに変換する
    ois.close();

    }
  }


  
// public static Hero loadHeroFromFile() {
//     BufferedReader br = new BufferedReader(new FileReader("rpgsave.dat"));
//     String name = br.readLine(); 改行まで名前として読む
//     String hp = br.readLine();改行までHPとよむ
//     String mp = br.readLine();改行までMpと読む
//     br.close();
//     return new Hero(
//       name, Integer.parseInt(hp), Integer.parseInt(mp)
//     );
// }