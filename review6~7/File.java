import java.util.*;

import javax.crypto.CipherOutputStream;

import java.io.*;
import java.rmi.dgc.VMID;


public class File {
  public static void main(String[] args) throws IOException {
    FileWriter fw = new FileWriter("rpgsave2.dat", true);
    BufferedWirter bw = new BufferedWriter(fw);
    fw.write('A');
    fw.write("大谷さんのホームラン\n\r");
    fw.write("次の試合は何かが起きるそんな気がするんだ\r\n");
    fw.flush();
    fw.close();

    FileReader fr = new FileReader("rpgsave2.dat");
    BufferedReader br = new BufferedReader(fr);

    System.out.println("全てを読み込んでいます！");

    String line = null;

    while ((line = br.readLine()) != null) {
      System.out.println(line);
      line = br.readLine();
    }
    int i = fr.read();
    while (i != -1) {
      System.out.print((char)i);
      i = fr.read();
    }
    fr.close();

    FileOutputStream fos = new FileOutputStream("rpgsave3.dat", true);
    CipherOutputStream cos = new CipherOutputStream(fos, algo);
    cos.write(65);
    cos.write("大いなる力よ".getBytes());
    cos.flush();
    cos.close();

    fos.write("明日はきっと晴れていることでしょー！！\r\n".getBytes());
    fos.write("私もそう思うよ！".getBytes());
    fos.flush();
    fos.close();

    FileInputStream fis = new FileInputStream("rpgsave3.dat");
    int is = fis.read();
    while (is != -1) {
      System.out.print((c)is);
      is = fis.read();
    }
    System.out.println("はいおっけー！");


    Path p1 = Paths.get("c:\\Users\\yoshiteru toyoda\\lib\\MeikaiJava\\review6~7\\rpgsave3.dat");
    
    p1.toPath();
    Path p2 = file.toPath();
    Files.copy(Paths.get("rpgdata2.dat"), Paths.get("rpgdata3.dat"));
  }
}
