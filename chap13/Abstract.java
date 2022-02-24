package chap13;

  abstract class Abstract {
  public abstract String toString();
  public abstract void draw();
  public void print() {
    System.out.println(toString());
    draw();
  }
}

public abstract class AbstLine extends Abstract {
  private int length;
  AbstLine(int length) { this.length = length; }
   int getLength(){ return this.length; }
   void setLength(int length) { this.length = length; }
}

class HorzLine extends AbstLine {
  HorzLine(int length) { super(length); }
  @Override void draw() {
    for (int i = 1; i <= getLength(); i++){
      System.out.print("-");
    }
    System.out.println();
  }
}
abstract void gori();
class VertLine extends AbstLine{
  VertLine(int length) { super(length); }
  @Override void draw(){
    for (int i = 1; i <= getLength(); i++) {
      System.out.println("|");
    }
  }
}
class Point extends Abstract{
  Point(){ };
  @Override void draw(){
   System.out.println('+');
  }
}

class Rectangle extends Abstract{
  private int width;
  private int height;

  Rectangle(int width, int height) {
    this.width = width; this.height = height;
  }
  @Override void draw(){
    for (int i = 1; i <= height; i++){
      for(int j = 1; j <= width; j++){
        System.out.println("*");
      }
      System.out.println();
    }
  }
}