package chap25;

//import java.lang.ProcessBuilder;
import java.lang.reflect.*;
import java.io.*;
import java.util.Scanner;

public class Launch {
  
  public static void main(String[] args) throws IOException, Exception {

    Scanner stdIn = new Scanner(System.in);
    if (args.length != 2) {
      System.out.println("引数を二つ選択してください！");
      System.out.println("Launch one two");
    }
    System.out.println(args.length);

    String cmd1 = args[0];
    String cmd2 = args[1];
    
    
    showMemory();//現在のメモリーの使用量
    // String cmd1 = args.getClass().getName();
    System.out.println(cmd1);

    try {
    Class<?> clazz = Class.forName(cmd1);//"chap25.Launch"
    showMethod(clazz);

    // do{
    // System.out.print("内部接続か外部接続か選択してください！: <I>・・内部 / <E> ・・外部:  ");
    // cmd2 = stdIn.next();
    // } while(cmd2 == "I" || cmd2 == "E");

    if (cmd2.equals("E")) {
      launchExternal(clazz);
    } else if (cmd2.equals("I")) {
      launchInternal(clazz);
    } else { 
      throw new IllegalArgumentException(
        "起動方法の指定が不正です"
      );
    }
  } catch (Exception e) {
    System.out.println(e);
  }
  showMemory();

    boolean er = true;
      if (er) {
      System.exit(0);
    } else {
      System.out.println("異常が発生しているため終了します!");
      System.exit(1);
    }

  }

    public static void launchExternal(Class<?> clazz) throws Exception {
      ProcessBuilder pb = new ProcessBuilder("java", clazz.getName());
      //javaを起動するときは 第一引数は　"java"でファイル名は実行したいクラスのFQCN名が必要
      Process proc = pb.start();
      proc.waitFor();//プログラムの終了まで待つためのメソッド waitFor();

    }

    public static void launchInternal(Class<?> clazz) throws Exception {
      Method m = clazz.getMethod("main", String[].class);
      String[] args = {};
      m.invoke(null, (Object)args );//嬢的メソッドは第一引数に何を指定も大丈夫であるので今回はnullでも出来ることを示してる！
    }
    
  //java.lang.Runtime;
  public static void showMemory() {
    long free = Runtime.getRuntime().freeMemory();//残りの残量
    long total = Runtime.getRuntime().totalMemory();//全体の容量
    long max = Runtime.getRuntime().maxMemory();//利用上限最大値

    long usage = (total - free) / 1024 / 1024; //全体から残りを引くことによって使用量が分かる MBにへんかんしている。
    System.out.println("現在の使用量は " + usage + "  MBです！" );

  }

  public static void showMethod(Class<?> clazz) {
    System.out.println("メソッドを表示します！");
    Method[] mm = clazz.getDeclaredMethods();
    for (Method m : mm) {
      System.out.println( m.getName() );
    }
    System.out.println("これが全てです！");
  }
}