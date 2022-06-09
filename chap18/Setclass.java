package chap18;

import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Setclass {
 public static void main(String[] args){
   Set<String> set1 = new HashSet<String>();
   Set<Integer> set2 = new LinkedHashSet<Integer>();

   set1.add("スイカ");
   set1.add("メロン");
   //contains の値はbooleanでtrue か falseで戻り値

   set1.contains("メロン");
   set1.contains("スイカ");
   //要素の長さ
   set1.size();

   
 } 
}
