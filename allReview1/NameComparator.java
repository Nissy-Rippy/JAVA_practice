import java.util.Comparator;

public class NameComparator implements Comparator<Bank> {
  public int compare(Bank x, Bank y) {
    return x.getName().compareTo(y.getName());
  }
}
