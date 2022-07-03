
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.io.*;

public class Filenext {

  public void saveHeroFile(Hero h) throws IOException {
    Writer w = new BufferedWriter(new FileWriter("rpgsave.dat"));
      w.write(h.name + "\n");
      w.write(h.hp + "\n");
      w.write(h.mp + "\n");
      w.flush();
      w.close();
  }
  public void readerHero() throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("rpgsave.dat"));
    String name = br.readLine();
    String hp = br.readLine();
    String mp = br.readLine();
  }

  public static void main(String[] args) {
    
  }
}
