package chap17;

public class ExternalApp {
  public static void main(String[] args) {
    // String cmd = "cmd /c start cmd.exe /K java DateApp";
    String cmd = "calc"; 
    // String cmd = "cmd /c start cmd.exec /K test"; バッチを使うとｋのコマンド
    System.out.println("cmd = " + cmd);
    Runtime runtime = Runtime.getRuntime();
    try{ 
      runtime.exec( cmd );
    } catch (Exception e) { System.out.println(e); }
  }
}
