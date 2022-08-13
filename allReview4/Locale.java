
import java.lang.reflect.*;
import java.util.Locale;

public class Locale {
  public static void main(String[] args) {

    long f = Runtime.getRuntime().freeMemory() / 1024 / 1024;
    long t = Runtime.getRuntime().totalMemory() / 1024 / 1024;
    long m = Runtime.getRuntime().maxMemory() / 1024 / 1024;

    Class<?> info1 = String.class;
    System.out.println(info1.getSimpleName());
    System.out.println(info1.getName());
    System.out.println(info1.getPackageName().getName());
    System.out.println(info1.isArray());
    System.out.println(info1.isInterface());
    System.out.println(info1.isEnum());

    Class<?> info2 = args.getClass();
    System.out.println(info2.getSuperclass());
    System.out.println(info2.getModule());



  }
}
