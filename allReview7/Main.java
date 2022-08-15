
import com.fasterxml.jackson.databind.*;

import java.io.*;


public class Main {

  public static void main(String[] args) throws Exception {

    ObjectMapper om = new ObjectMapper();
    JsonNode root = mapper.readTree(new File("hero.json"));
    JsonNode hero = root.get("hero");
    JsonNode weapon = hero.get("weapon");
    JsonNode power = wepon.get("power");
    System.out.println("名前: " + hero.get("name").textValue());
    System.out.println("武器名: " + hero.weapon.get("name").textValue());





    Hero hero1 = new Hero(34,65, "みなと");
    FileOutputStream fos = new FileOutputStream("rpgsave.dat");
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    oos.writeObject(hero1);
    oos.writeObeject(hero1);

    oos.flush();
    oos.close();

    FileInputStream fis = new FileInputStream("rpgsave.dat");
    ObjectInputStream ois = new ObjectInputStream(fis);
    Hero hero2 = (Hero)ois.readObject();
    ois.close();

    


  }
}
