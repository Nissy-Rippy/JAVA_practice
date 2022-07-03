import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;

public class Filexml {
  public static void main(String[] args) throws Exception {

    InputStream is = new FileInputStream("rpgsave.xml");
    Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(is);//文章全体を取得
    Element hero = doc.getDocumentElement();//文章全体から、一番外側のheroタグを取得
    Element weapon = findChildByTag(hero, "weapon");//hero タグの中にある　weaponタグを取得
    Element power = findChildByTag(weapon, "power");//weapon タグの中にあるpowerタグを取得
    String value = power.getTextContent();//powerの文字列情報を取得する
    System.out.println(value);

  }

//Elementクラス NodeList

  static Element findChildByTag(Element self, String name) throws Exception {
    NodeList children = self.getChildNodes();//全ての子を取得する
    for (int i = 0; i < children.getLength(); i++) {
      if (children.item(i) instanceof Element) {
        Element e = (Element)children.item(i);
        if (e.getTagName().equals(name)) {//tagを照合している
          return e;
        }
      }
    }
    return null;
  }
}
