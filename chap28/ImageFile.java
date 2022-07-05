import java.awt.image.*;
import javax.imageio.*;
import java.io.*;


public class ImageFile {
  public static void main(String[] args ) {
    BufferedImage image = ImageIO.read(new File("minato.jpg"));//まずは、BufferedImageにImageIOで読み込んで代入
    try(FileOutputStream fos = new FileOutputStream("minato.png")) {//変換先（書き込み先)
      ImageIO.write(image, "png", fos);//ImageIO.write()をつかって書き込んでいく第一引数に変換元のファイル、そしてformat typeそして第三引数に返還後の出力先
      
    }
  }
}
