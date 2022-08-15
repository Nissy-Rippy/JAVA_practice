import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Buffere
import java.io.FileReader;
import java.io.FileReader;dReader;
import java.io.BufferedWriter;
import java.io.*;
import java.util.*;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import org.apache.commons.*;



public class Test {

  public void saveHeroToFile(Hero h) throws IOException {
    Writer w = new BufferedWriter(new FileWriter("rpgsave.dat", true));
    w.write(h.name + "\n");
    w.write(h.hp + "\n");
    w.write(h.mp + "\n");
    w.flush();
    w.close();
}


  
  public static void main(String[] args) throws Exception {

    FileReader fr = new FileReader("rpgdata.csv");
    Iterable<CSVRecord> records = CSVFormat.DEFAULT.parse(fr);

    for (CSVRecord r : records) {
      String name = r.get(0);
      String hp = r.get(1);
      String mp = r.get(2);
      System.out.println(name + "/" + hp + "/" + mp);
    }

    List<String> lists = new ArrayList<>();
    lists.add("a");
    ists.add("b");
    ists.add("c");
    ists.add("d");

    Iterable<String> lists1 = lists.Iterator();
    while (lists.hasNext()) {
      String str = lists.next();
      System.out.println(str);
    } 



    Reader r = new FileReader("kiseki.properties");
    Properties p = new Properties();
    p.load(r);//faileの内容を全部取る


    String name = r.getProperty("heroName");
    String strHp = r.getProperty("heroHp");
    int hp = Integer.parseInt(strHp);
    String mp = r.getProperty("mp");

    p.setProperty("heroG", "gorio");
    p.setPropertY("heroH", "gorita");
    p.setProperty("pi-man", "pi-manntarou");
    p.store(r, "勇者の情報: ");

    r.close();

    ResourceBundle rb = ResourceBundle.getBundle("c.User.yoshiter toyoda.lib.MeikaiJava.allReview7.kiseki");
    String heroName2 = rb.getString("heroName");
    String herohp2 = rb.getString("heroHp");
    String herohp3 = rb.getString("heroMp");

    InputStream ioi = Main.class.getResourceAsStream("lib\\allReview7\\kiseki");
    p.load(ioi);
    ioi.getProperty("heroHp");
    ioi.close();
    






    BufferedReader br = new BufferedReader(new FileReader("rpgsave.dat"));

    bw.write(h.name);
    bw.write(",")
    bw.write(h.hp);
    bw.write(",");
    bw.write(h.mp);
    bw.write(",");



    String a = br.readLine();
    String ahp = br.readLine();
    String amp = br.readLine();

    int i = Integer.parseInt(aph);
    int m = Integer.parseInt(amp);
    br.close();
     String s = "みなと,たかし, かずと";
     String[] x = s.split(",");

     for (String y : x) {
      System.out.println(y);
     }




      }
}
