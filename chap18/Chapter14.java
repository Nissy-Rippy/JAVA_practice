package chap18;
import java.util.List;
import java.util.ArrayList;

public class Chapter14 {
  public static void main(String... args){
    List<Character> list1 = new ArrayList<Character>();
    Soldier sr = new Soldier();
    Playboy py = new Playboy();
    // list1.add(new Soldier());
    // list1.add(new Playboy());
    list1.add(sr);
    list1.add(py);
    Chapter14.partyAttack(list1);
  }
  public static void partyAttack(List<Character> party) {
    for (Character member : party) {
      int hp = member.attack();
      System.out.println("ヒットポイント　:　" + hp);
    }
  }
}
