package chap27;

 import java.io.RandomAccessFile;
 public class RandomSeek {
  public static void main(String[] args) {
    
    RandomAccessFile f  = new RandomAccessFile("file.txt", "rw");//rw 読み取り、書き取り専用 /r読み取り専用
    f.seek(20);//20バイト目から1バイト読み取る
    
    byte b  = f.readByte();
    
    //18バイト目に書き込む
    f.seek(18);//読み取る
    f.writeByte(b);//書き取る  読み取ってから書き込まないといけない


  }
}
