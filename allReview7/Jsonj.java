import java.io.*;

public class Jsonj {


  public Hero loadHeroFromFile() throws IOException {
    BufferedReader br =
    new BufferedReader(new FileReader("rpgsave.dat"));
    String name = br.readLine();
    String hp = br.readLine();
    String mp = br.readLine();
    br.close();
    return new Hero(
      name, Integer.parseInt(hp), Integer.parseInt(mp)
    );
  }

}
