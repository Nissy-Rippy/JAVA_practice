package chap10;

import java.util.Random;

public class Matome {

  private static int counter = 0;
  private int id;
  private int x = 0, y = 0, z = 0;

  static { Random r = new Random(); counter = r.nextInt(10) * 100; }

         { id = ++counter; }
         
  public Matome() { }
  public Matome(int x) { this.x = x; }
  public Matome(int x, int y) { this.x = x; this.y = y; }
  public Matome(int x, int y, int z) {this(x, y); this.z = z; }
  public static int getCounter() { return counter; }
  public int getId() { return id; };
  public String toString() { return "(" + x + "," + y +"," + z + ")"; }
}

public class Point3Tester{
  public static void main(String[] args) {
    Matome matome = new Matome();
    Matome matome1 = new Matome(1);
    Matome matome2 = new Matome(1,2);
    Matome matome3 = new Matome(2,4,5);
    System.out.println("matome1 = " + matome1.getId());
  }
}