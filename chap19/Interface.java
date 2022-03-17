package chap19;

@FunctionalInterface
public interface Interface {
  public abstract void stop();
  public static void keep(){ System.out.println("アレクサ"); }
}

// @FunctionalInterface2つあるので、エラーになる！
interface Interface2 {
  public abstract void stop();
  public void cold();
  public static void keep(){ System.out.println("アレクサ"); }
}
