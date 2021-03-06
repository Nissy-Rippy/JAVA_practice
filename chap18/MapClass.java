package chap18;

import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class MapClass {
  public static void main(String[] args){
    //HashMapは Integer String
    //TreeMApは String String
    Map<Integer, String> map1 = new HashMap<Integer, String>();
    Map<String, String> map2 = new TreeMap<String, String>();

    map1.put(0, "りんご");
    map1.put(4, "バナナ");
    map1.put(0, "アジの開き");
    map1.get(0);
    map1.containsKey(0);
    map1.containsValue("バナナ");
    map1.size();

    map1.remove(1);
    map1.remove("りんご");

    Map<Integer, String> maps = new HashMap<Integer, String>();
    //key と valueを設定してあげる
    maps.put(0, "ooike");
    map1.put(1, "kogure");
    map1.put(2, "kouta");
    map1.put(3, "takao");
//keySet()で0,1,2,3,4、を出す
    for(Integer key : map1.keySet()) {
      System.out.println(key);
    }
// valuedで要素を出力する
    for(String name : map1.values()){
      System.out.println(name);
    }
    // MAPでの要素を両方一緒に取り出すときはMap.Entry<Integer, String>を使う entrySet();
    for(Map.Entry<Integer, String> classmate : maps.entrySet()) {
      System.out.println("出席番号: " + classmate.getKey() + " お名前 : " + classmate.getValue());
    }
  }
}
