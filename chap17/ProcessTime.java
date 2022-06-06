package chap17;

public class ProcessTime {

  public static void main(String[] args) {
    
    long start = System.nanoTime();
    for (int i = 0; i < 1000; i++) { ;}
    long end = System.nanoTime();
    System.out.println("for loop     : " + (end -start) + "(nsec)");
    
    start = System.nanoTime();
    int i = 0; while(i < 1000) { ; i++; }
    end = System.nanoTime();
    System.out.println("while loop  : " + (end -start) + "(nsec)");

    start = System.nanoTime();
    i = 0; do { ; i++; } while(i < 1000);
    end = System.nanoTime();
    System.out.println("do-while    : " + (end -start) + "(nsec)");

  }
}
