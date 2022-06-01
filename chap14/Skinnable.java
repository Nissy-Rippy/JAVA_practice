package chap14;

public interface Skinnable {
// finalクラス変数　Skinnable.Greenというかたちで呼び出せる.

  public static final int White = -1;
  public static final int Black = 0;
  public static final int Red = 1;
  public static final int Green = 2;
  public static final int Leopard = 3;
  public static final int blue = 4;
  void changeSkin(int skin);

}
