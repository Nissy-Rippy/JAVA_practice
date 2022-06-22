package chap25;

import java.lang.reflect.*;

public class RefMain {
  public static void main(String[] args) throws Exception {

      Class<?> clazz = RefSample.class;//Refclassの情報を格納する
      Constructor<?> cons = clazz.getConstructor(int.class);//コンストラクタを取得し

      Constructor<?> cons1 = clazz.getConstructor(int.class, String.class);
      RefSample rs = (RefSample)cons.newInstance(421);//取得したコンストラクタに値を代入していく
      // RefSample rs1 = (RefSample) cons.newInstance(123,"tomato");
      Field f = clazz.getField("times");
      f.set(rs, 5);
      System.out.println(f.get(rs));

      Method m = clazz.getMethod("hello", String.class, int.class);
      m.invoke(rs, "reflection!", 143);
      boolean pubc = Modifier.isPublic(clazz.getModifiers());
      boolean finm = Modifier.isFinal(m.getModifiers());

      System.out.println(pubc);
      System.out.println(finm);
      System.out.println(clazz.getDeclaredFields());
      System.out.println(clazz.getConstructors());
      System.out.println(clazz.getDeclaredMethods().length);


  }
}
