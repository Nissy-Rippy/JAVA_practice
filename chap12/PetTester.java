package chap12;


import java.util.Scanner;

class PetTester {
  public static void main(String[] args) {

    Scanner stdIn = new Scanner(System.in);

    Pet kurt = new Pet("golia", "golira mother");
    kurt.introduce();

    RobotPet robo = new RobotPet("robot", "animal");
    robo.introduce();
    
    System.out.println("( (1) Pet class/ (2)RobotPet class) :");
    int n = stdIn.nextInt();

    Pet p;
    if(n == 1) {
      p = kurt;
    } else {
      p = robo;
    } 
     p.introduce();
    }
  
  }
