
//jarファイルは別にある
import org.apache.commons.*;
import java.io.*;


public class FileCsv {
  public static void main(String[] args) throws IOException {
    
    FileReader fr = new FileReader("rpgdata.csv");
    Iterable<CSVRecord> records = CSVFormat.DEFAULT.parse(fr);
    for (CSVRecord r : records) {
      String name = r.get(0);
      String hp = r.get(1);
      String mp = r.get(2);
      System.out.println(name + "/" + hp + "/" + mp);
    }
    fr.close();

  }
}
