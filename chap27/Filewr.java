package chap27;

import java.io.*;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;

public class Filewr {
  public static void main(String[] args) throws IOException {
    FileWriter fw = null;
    try{
    // true はデータの末尾からデータを追記していくfalse、省略の場合はファイルの先頭からデータを上書きしていきます
    FileWriter fw = new FileWriter("rpgsave.dat", true); // 第一引数は、ファイル名！！ファイルがない場合は新しく作成する！
    // flush()をファイルを閉じる前にしないと正しくデータが書き込まれないことがある。そのため、JVMに今すぐカキコでない部分を書き出せとの支持
    fw.write("A");
    fw.flush(); }
    catch(IOException e) { System.out.print("エラーが起きました！"); }
    finally{
      if(fw != null) {
       try{
         fw.close();
      } catch (IOException e) { System.out.println("ファイル閉じるのに失敗！");}
    }
  }

  //try-With-resoureces文で書くとこうなる！
// try(){}
  try(
    FileWriter ff = new FileWriter("xbox", true);//自動的にclose を呼び出してくれるのでfinally文を書かずにスマートにかける！
  ) { ff.write();
      ff.flush();
    } catch (IOException e) { throw e; }

  }
}
