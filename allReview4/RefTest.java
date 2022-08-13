import java.lang.reflect.*;;

public class RefTest {
  public static void main(String[] args) throws Exception {
    Class<?> clazz = RefSmaple.class;
    Constructor<?> cons = clazz.getConstructor(int.class);
    RefSmaple rs = (RefSmaple)cons.newInstance(3);

    Field f = clazz.getField("times");
    f.set(rs, 584);
    System.out.println(f.get(rs));

    Method m = clazz.getMethod("hello", String.class, int.class);
    m.invoke(rs, "reflection!", 125);

    boolean pubc = Modifier.isPublic(clazz.getModifiers());
    boolean publ = Modifier.isFinal(m.getModifiers());
  }
}
