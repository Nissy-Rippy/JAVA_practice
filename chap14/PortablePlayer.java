package chap14;

public class PortablePlayer implements Player, Skinnable {

  private static final int Blue = 0;
  private int skin = Black;

  public PortablePlayer() { }

  @Override public void play() {
   System.out.println("再生開始ー！！");
 }
  @Override public void stop() {
   System.out.println("再生終了ー！！！");
 }
//Skinnableの関数

  @Override public void changeSkin(int skin){
    System.out.print("スキンを選んでください:  ");
   switch (skin) {
    case Black:   System.out.print("黒");    break;
    case Red:     System.out.print("赤");    break;
    case blue:    System.out.print("青");    break;
    case Leopard: System.out.print("豹柄");  break;
    case Green:   System.out.print("緑");    break;
    default:      System.out.print("無地");  break;
  }

    System.out.println("に変更ししました！！");

 }

}
