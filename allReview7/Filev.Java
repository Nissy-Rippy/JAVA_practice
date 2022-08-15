import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;


public class Filev {
  
  public static void main(String[] args) throws Exception {

    InputStream is = new FileInputStream("rpsave.xml");
    Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(is);
    Element hero = doc.getDocumentElement();
    Element weapon = findChildByTag(hero, "weapon");
    Element power = findChildByTag(weapon, "power");
    String value = power.getTexContent();
  }

  static Element findChildByTag(Elemet self, String name) throws Exception {
    NodeList children = self.getChildNodes();
    for (int i = 0; i < children.getLength(); i++) {
      if (children.item(i) instanceof Element) {
        Element e = (Element)children.item(i);
        if (e.getTagName().equals(name)){
          return e;
        }
      }
    }
    return null;
  }
}