import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.*;
import java.io.*;

public class App {


    // public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
//         ObjectMapper mapper = new ObjectMapper();
//         // readValueもreadTreeみたいなもの! ただ第二引数を必要としている。
//         JsonFileData file = mapper.readValue(new File("hero.json"), JsonFileData.class);
//         System.out.println("名前: " + file.hero.name);
//         System.out.println("武器: " + file.hero.weapon.name);

//     }
// }
// }

    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();//Jsonのファイルの内容を受け取る
        //readTreeで全部を読み込む
        JsonNode root = mapper.readTree(new File("hero.json"));//JsonNodeインスタンスとして読み取り取り出す
        //get で各要素を取り出す
        JsonNode hero = root.get("hero");
        JsonNode weapon = hero.get("weapon");
        System.out.println( "名前" + hero.get("name").textValue() );
        System.out.println( "武器" + weapon.get("name").textValue() );

    }
}

