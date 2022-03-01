package chap17;
import java.io.*;
import java.util.Random;

public class File_out_put {
  public static void main(String[] args) {
    int MAX = 20;
    int[] rand_number = new int[MAX];
    Random rand = new Random();
    for (int i = 0; i < MAX; i++) {
      rand_number[i] = rand.nextInt(100);
    }
    try{
      File file = new File("random_20.txt");
      FileWriter fw = new FileWriter(file, false);
      BufferedWriter bw = new BufferedWriter(fw);
      // BufferedWriter bw = new BufferedWriter(new FileWriter( new File("20randomt"), false));
      for (int i = 0; i < MAX; i++) { bw.write(rand_number[i] + ","); }
      bw.close();
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}
