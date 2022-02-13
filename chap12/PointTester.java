package chap12;

class Point2D{
  private int x;
  private int y;
public Point2D (int x, int y) { this.x = x ; this.y = y }
  public void setX(int x) { this.x = x; }
  public void setY(int y) { this.y = y; }
  public int getX() { return this.x; }
  public int getY() { return this.y; }
}

class Point3D extends Point2D{
 private int z;
public Point3D(int x, int y, int z) { super(x,y); this.z = z; } }
 public void setZ(int z) { this.z = z; }
 int getZ() { return this.z; }
}


public class PointTester {
  public static void main(String[] args) {
    Point2D a = new Point2D(10, 15);
    Point3D b = new Point3D(20, 30, 40);

    System.out.printf("a = (%d, %d)\n", a.getX(), a.getY());
    System.out.printf("b = (%d, %d, %d)\n", b.getX(), b.getY(), b.getZ());
     
  }
}