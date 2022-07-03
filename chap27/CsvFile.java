import java.util.*;

public class CsvFile {
  public static void main(String[] args) {
    String ss = "田中、佐藤、渡辺、小林、大池";
    String[] s = ss.split(",");

    for(String t : s) {
      System.out.println(t);
    }
  }
}
