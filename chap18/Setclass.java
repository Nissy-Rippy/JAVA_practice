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
   set1.contains("メロン");
   set1.contains("スイカ");
   set1.size();

   
 } 
}
