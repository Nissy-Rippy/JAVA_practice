package chap12;

public class PetTester2 {
  
  static void intro(Pet p) {
    p.introduce();
  }

  public static void main(String[] args) {
    Pet[] a = {
      new Pet("gori", "gori1"),
      new RobotPet("gorio", "gori2"),
      new Pet("goriri", "gori3")
    };
    
  
    for (Pet i : a) {
      intro(i);
      System.out.println();
    }

    for ( int i = 0; i < a.length; i++) {
      if ( a[i] instanceof RobotPet){
        ((RobotPet)a[i]).work(0);
      } else {
        a[i].introduce();
      }
    }

  }
}
