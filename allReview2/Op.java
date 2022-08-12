import java.util.Optional;
import java.util.*;


public class Op{

  public static Optional<String> decorate(String s, char c) {
    String r;
    if ( s == null || s.length() == 0 ) {
      r =null;
    } else {
      r = c + s + c;
    }
    return Optional.ofNullable(r);
  }
  public static void main(String[] args) {
    Optional<String> op1 = Optional.ofNullable("みなと");
    Optional<String> op2 = Optional.ofNullable("null");
    Optional<Integer> op3 = Optional.of(2); 
   System.out.println(op2);

   op1.isPresent();

   System.out.println(op1.get());
   System.out.println(op2.get());

   System.out.println(op1.orElse("ななし"));
   System.out.println(op1.orElse("ごりら"));
   System.out.println(op3.orElse(4));

   Optional<String> s = decorate("おじいちゃん", '@');
   System.out.println(s.orElse("nullのため処理できませんでした；ｗ；"));

   Optional<String> safe = decorate("マイケル富岡", '*');
   System.out.println( safe.orElse("nullジャン！！！処理不可能です！") );

   
  }
}