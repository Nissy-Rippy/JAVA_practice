package chap10;

public class Circle {
  
  private Point2D center;
  private int radius = 0;

  public Circle() { center = new Point2D(); }
  public Circle(Point2D c, int radius) {
    this.radius = radius; center = new Point2D(c);
  }

  public Point2D getCenter() { return new Point2D(center); };
  public int getRadius() { return this.radius; }
  
  public void setCenter(Point2D c) {
    center.set(c.getX(), c.getY());
  }
  public void setRadius(int radius) { this.radius = radius; }

  public String toString() {
    return "中心座標" + center.toString() + "半径" + radius;
  }
}
