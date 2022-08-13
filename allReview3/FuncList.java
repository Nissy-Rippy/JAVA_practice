public class FuncList {
  public static boolean isOdd(int num) { return num % 2 == 1; }
  public String passCheck(int point, String name) {
    return name + "さんは" + (point > 65 ? "合格" : "不合格");
  }
}
