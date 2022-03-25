package chap08;

public class Car {
   private String name;
   private int width;
   private int height;
   private int length;
   private double x;
   private double y;
   private double fuel;

   Car (String name, int width, int height, int length, double x, double y, double fuel) {
     this.name = name;
     this.width = width;
     this.height = height;
     this.length  = length;
     this.x = x;
     this.y = y;
     this.fuel = fuel;
   }

   public double getX() { return x;}
   public double getY() { return y;}
   public double getFuel() { return fuel;}

   public boolean move(double dx, double dy) {
     double dist = Math.sqrt(dx * dx + dy * dy);
     if (dist > fuel) {
       return false;
     } else {
       x += dx;
       y += dy;
       fuel -= dist;
       return true;
     }
   }
   public void carSpec () {
    System.out.println("車名:　" + name);
    System.out.println("車幅;　" + width + "mm");
    System.out.println("車高;　" + height + "mm");
    System.out.println("車長:　" + length + "mm");

   }
}
