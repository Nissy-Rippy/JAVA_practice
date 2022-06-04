package chap17;

import java.io.*;

public class File_ijnput2 {

  public static void main(String[] args) {
    
    int MAX = 20;
    int[] rand_number = new int[MAX];

    try{

      File file = new File("rand_20F.txt");
      //BufferedReader br = new BufferedReader(new FileReader(file) );
      BufferedReader br = new BufferedReader(new FileReader(file));
      int row = 0;
      String s;
      //nullでないなら
      while ( (s = br.readLine()) != null) {
      // . で区切る split
        String[] str = s.split(",");
        int col_MaX = str.length;
        for (int i = 0; i < col_MaX; i++) {
          rand_number[row * col_MaX + i] = Integer.parseInt( str[i].trim( ) );
        }
        row++;
      }
      br.close();

    } catch (IOException e) { System.out.println(e); }

    for (int i = 0; i < MAX; i++){
      if(i % 5 == 0 && i != 0) { System.out.println(); }
      System.out.printf("%5d,", rand_number[i]);
    }
  }
}
