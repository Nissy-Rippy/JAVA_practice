package chap14;

public class Rectangle implements Plane2D {

  private int height;
  private int width;
  //面積求める
  public int getArea() { return height * width; }
  
}
