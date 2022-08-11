
import java.util.*;
import java.text.SimpleDateFormat;

public class Main {

  public static void main(String[] args) throws Exception {
    SimpleDateFormat f = new SimpleDateFormat("yyyy/mm/dd");
    ArrayList<Bank> lists = new ArrayList<>();

    Bank b1 = new Bank();
    b1.setName("吾輩は猫である");
    b1.setPublishDate(f.parse("2022/02/03"));
    b1.setComment("あいだみつお！！");
    lists.add(b1);

    Bank b2 = new Bank();
    b2.setName("火星に行くぞー！");
    b2.setPublishDate(f.parse("2344/44/32") );
    b2.setComment("もはや適当！");
    lists.add(b2);

    Collections.sort(lists);
    Collections.sort(lists, new NameComparator());

    for (Bank bank : lists) {
      System.out.println( bank.getName() );
    }

  }
}
