package chap18;

import java.util.*;
import java.util.List;
  
public class Class {

  public static void animal(Animal animal) {
    System.out.println(animal);
  }
  
  public static void desert(Desert desert) {
    System.out.println(desert);
  }
  public static void main(String[] args) {
    Outer outer = new Outer();
    Outer.Inner inner = outer.new Inner();
    Outer1 outer1 = new Outer1();
    Outer1.Inner1 oi = new Outer1.Inner1();


//内部クラス
     Human human = new Human();
     Human.Human_Leg leg = human.new Human_Leg();

    new Human().new Human_Leg().kick();


    leg.kick();




    
    System.out.println(Desert.APPLE);
    System.out.println(Desert.ICE_CREAM);
    System.out.println(Desert.CAKE);
  
    Desert apple = Desert.APPLE;
    Desert cake = Desert.CAKE;
    desert(Desert.APPLE);
    desert(Desert.CAKE);

    animal(Animal.GORIRA);
    System.out.println(Animal.DOG.name());
    System.out.println(Animal.valueOf("DOG"));
    Animal ani = Animal.valueOf("CAY");
    System.out.println(ani);
    System.out.println(Animal.CAT.ordinal());

    System.out.println(Desert.APPLE.getPrice());
    System.out.println(Desert.ICE_CREAM.getPrice());
    System.out.println(Desert.CAKE.getPrice());

    Animal.DOG.advertise();
    Animal.CAT.advertise();
    Animal.GORIRA.advertise();
  }
}
