package aaa.chap06;
import java.util.Arrays;

public class multiarray {
  public static void main(String[] args) {
   int[][] a = { {1,2,3}, {4,5,6} };
   int[][] b = { {6,3,4}, {5,1,2} };
   int[][] c = { {0,0,0}, {0,0,0} };
   for (int i = 0; i < 2; i++){
     for (int j = 0; j < 3; j++) {
       c[i][j] = a[i][j] + b[i][j];
     }
   }
   System.out.println("行列a " + Arrays.deepToString(a));
   System.out.println("行列b " + Arrays.deepToString(b));
   System.out.println("行列c " + Arrays.deepToString(c));
  int[][] x = new int[2][3];
  int[][] y;
  y = new int [3][];
  y[1] = new int[3];
  y[2] = new int[4];
  y[0] = new int[2];
  int[][] g = {new int[3], new int[4], new int[2]};
  int[][] w = {
    {1,3,4},
    {3,4,5},
    {3,4,5},
  }
  
  for (int[] i : a) {
    for (int ab : i) {
      System.out.printf("%5.1f", ab);
    }
  }

  }
}
