package chap17;
import java.io.*;
import java.util.Random;

public class File_print_out {
  public static void main(String[] args) {
    int MAX = 20;
    int[] rand_number = new int[MAX];
    Random rand = new Random();
    for(int i = 0; i < MAX; i++) { rand_number[i] = 1 + rand.nextInt(100) };
    try{
      File file = new File("rand_20F.txt");
      FileWriter fw = new FileWriter(file, false);
      BufferedWriter bw = new BufferedWriter(fw);
      PrintWriter pw = new PrintWriter(bw);
      for (int i = 0; i < MAX; i++) {
        if(i % 5 == 0 && i != 0 ) { 
          pw.write("\n");
          String s = String.format("%5d,", rand_number[i]);
          pw.write(s);
        }
        pw.close();
      } catch (IOException e) {
        System.out.println(e);
      }

    }
  }
}
