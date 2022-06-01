package chap13;
//抽象クラス
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
  public AbstLine(int length) { this.length = length; }
   int getLength() { return this.length; }
   void setLength(int length) { this.length = length; }
}

class HorzLine extends AbstLine {
  //コンストラクタ
  HorzLine(int length) { super(length); }

  @Override
  public void draw() {
    for (int i = 1; i <= getLength(); i++){
      System.out.print("-");
    }
    System.out.println();
  }
}

// abstract void gori();
class VertLine extends AbstLine{
  //コンストラクタの継承
  VertLine(int length) { super(length); }

  @Override
  public void draw(){
    for (int i = 1; i <= getLength(); i++) {
      System.out.println("|");
    }
  }
}

class Point extends Abstract{

  Point(){ };
  @Override
  public void draw(){
   System.out.println('+');
  }
}

class Rectangle extends Abstract{
  private int width;
  private int height;

  Rectangle(int width, int height) {
    this.width = width; this.height = height;
  }

  @Override 
  public void draw(){
    for (int i = 1; i <= height; i++){
      for(int j = 1; j <= width; j++){
        System.out.println("*");
      }
      System.out.println();
    }
  }
}