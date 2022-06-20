package chpa23;


//String向け
import java.util.Optional;
import java.util.OptionalInt;
import java.util.OptionalDouble;


public class Optional1 {

  public static Optional<String> decorate(String s, char c) {
    String r;
    if( s == null || s.length() == 0) { r = null; }
    else {  r = c + s + c; }
    return Optional.ofNullable(r);
  }

  public static void main(String[] args) {
    Optional<String> sc = decorate("as", '*');
    System.out.println(sc);

    Optional<String> sf = decorate(null, 'x');

    System.out.println(sf.orElse("nullのためこういう結果になりました！"));
  }
}
