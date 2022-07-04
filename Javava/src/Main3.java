
import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;




public class Main3 {

  public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
    ObjectMapper mapper = new ObjectMapper();
    //readValueもreadTreeみたいなもの!　ただ第二引数を必要としている。
    JsonFileData file = mapper.readValue(new File("hero.json"), JsonFileData.class);
    System.out.println("名前: " + file.hero.name);
    System.out.println("武器: " + file.hero.weapon.name);

  }
}
