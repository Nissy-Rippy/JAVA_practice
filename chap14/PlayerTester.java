package chap14;

class PlayerTester {
  public static void main(String[] args) {
    Player[] a = new Player[2];
    a[0] = new VideoPlayer();
    a[1] = new CDPlayer();

    for (Player s : a) {
      s.play();
      s.stop();
      System.out.println();
    }

  }
} 
