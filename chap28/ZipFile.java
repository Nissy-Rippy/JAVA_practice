import java.util.zip.*;
import java.util.*;
import java.io.*;
import java.io.IOException;

public class ZipFile {
  public static void main(String[] args) throws IOException {
    try(  ZipFile file = new ZipFile("rpg.jar") ) {//JarFileも実態はZipファイルなので開くことが出来るのである
      for ( ZipEntry e : Collections.list(file.entries()) ) {
        System.out.println(e.getName() + "size = " + e.getCompressedSize() );//ファイルの名前とファイルのサイズを順番に表示する
      }
    }

  } 
}
