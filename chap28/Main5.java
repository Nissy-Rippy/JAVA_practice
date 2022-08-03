import java.util.*;
import java.text.*;
import java.io.*;

public class Main5 {

  public static void main(String[] args) throws Exception {
    
    Locale loc = Locale.getDefault();
    System.out.println( loc.getCountry() + "-" + loc.getLanguage() );
    String now = ( new SimpleDateFormat()).format(new Date());
    ResourceBundle rb = ResourceBundle.getBundle("messages");
    System.out.println( rb.getString("CURRENT_TIME_IS") + now );

  }
}
