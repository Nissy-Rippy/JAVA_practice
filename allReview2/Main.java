import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
// import static AccountType.TEIKI;
// import static AccountType.TOUZA;
// import static AccountType.FUTU;

public class Main {
  public static void main(String[] args) {

    StrongBox<E> sb = new StrongBox<>(KeyType.PADLOCK);

    Optional<E> o = sb.get();

    System.out.println(o.orElse("nullだったってことよ！そういうこと！"));
    
    // List<String> lists = Arrays.asList("gorio", "gorip", "gorita", "goririn");
    // List<Integer> nums = Arrays.asList(1,2, 3, 4, 5, 6, 7);
    // List<Bank> banks = Arrays.asList(new Bank(), new Bank(), new Bank());

    Account a = new Account("12839", AccountType.FUTU);
    Account b = new Account("233435", AccountType.TOUZA);
    Account c = new Account("4398539", AccountType.TEIKI);

    System.out.println(a.accountNo + a.accountType);

    Outer.Inner oi = new Outer.Inner();
    oi.innerMethod();

    Outer o = new Outer();
    Outer.Inner2 = o.new Inner2();

    Collections.sort(list, new Comparator<Account>() {
      public int compare(Account x, Account y) {
        return (x.zandaka - y.zandaka);
      }
    });
  }
}
