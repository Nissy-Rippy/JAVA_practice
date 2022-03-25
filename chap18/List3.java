package chap18;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List3 {
  public static void main(String[] args) {
    List<String> list1 = new ArrayList<String>();
    List<Integer> list2 = new LinkedList<Integer>();
    list1.add("りんご");
    list1.add("ごりら");
    list1.add("らっぱ");
    list1.add(2, "ぱんつ");
    list1.get(1);
    list1.contains("ごりら");
    list1.contains("aoof");

    System.out.println(list1);
    System.out.println(list1.contains("ごりら"));
    System.out.println(list1.size());
    
    list1.remove(0);
    list1.remove("りんご");

    List<String> lists = new ArrayList<>();
    lists.add("buri");
    lists.add("buriri");
    for (String list : lists) {
      System.out.println(list);
    }

  }
}
