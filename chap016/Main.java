import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {

    MyLogger logger1 = MyLogger.getInstance();
    logger1.log("first");
    MyLogger logger2 = MyLogger.getInstance();
    logger2.log("second");
    logger2.log("second");
  }
}
