
import java.io.*;
import java.io.StringReader;
import java.io.StringWriter;

import javax.swing.text.StyledEditorKit;

import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;

public class Streaming {
  public static void main(String[] args) throws IOException {
    String msg = "今日は母親と意見が食い違った";
    Reader rs = new StringReader(msg);

    for (int i = 0; i < msg.length(); i++) {
      System.out.print((char)rs.read());
    }
    // System.out.print((char)rs.read());
    // System.out.print((char)rs.read());
    
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    baos.write(65);
    baos.write(66);

    byte[] data = baos.toByteArray();//dataは、要素２のbyte型配列
  
    for (byte b : data) {
  //byte配列から1byteづつ書き込む
      System.out.println(b);
    }
  }
}
