package chap14;

public class Parallelogram implements Plane2D {
  private int height;
  private int width;

  public Parallelogram() { this.height = height; this.width = width; }
  @Override public int getArea() {
    return width * height;
  }


}
