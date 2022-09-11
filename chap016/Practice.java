
public class Practice {


  public static void main(String[] args) throws Exception {

    Thread t1 = new CountUpThread();
    Thread t2 = new CountUpThread();
    Thread t3 = new CountUpThread();
    new CountUpThread().start();
    new CountUpThread().start();

    t1.start();
    t2.start();
    t3.start();
    
  

  }
}
