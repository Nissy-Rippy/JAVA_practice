package revieww;
import java.util.Comparator;

public class AgeComparator implements Comparator<Hero> {
  public int compare(Hero x, Hero y) {
    return x.age - y.age;
  }
}
