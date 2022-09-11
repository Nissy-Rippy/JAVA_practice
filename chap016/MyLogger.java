import java.io.*;

public final class MyLogger {

  private final String TEXT = "dummylog.txt";
  private FileWriter writer;
  private static MyLogger theInstance;

  private MyLogger() {
    try {
      this.writer = new FileWriter(TEXT, true);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
 
  public void log(String text) throws IOException {
    // FileWriter fr = new FileWriter(TEXT);
    // fr.write(text + "\r\n");
    // fr.flush();
    // fr.close();

    this.writer.write(text);


  }
 
  public static MyLogger getInstance() throws IOException {
    if (theInstance == null) theInstance = new MyLogger();
    return theInstance;
  }
}
