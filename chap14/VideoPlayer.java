package chap14;

public class VideoPlayer implements Player {
  private int id;
  private static int count = 0;
  
  public VideoPlayer() { this.id = ++count; }
//一つ目
  @Override public void play() {
    System.out.println("++ビデオ再生！！");
  }
  //2つめ
  @Override public void stop() {
    System.out.println("ビデオ再生停止！！");
  }
  
  public void printInfo() {
    System.out.println("本機の製造番号は" + id + "です。");
  }
  
}
