package chap17;

import java.io.*;

public class File_input {

   public static void main(String[] args) {
    
    int MAX = 20;
     int[] rand_number = new int[MAX];

     try{

       File file = new File("random_20.txt");
       BufferedReader br = new BufferedReader(new FileReader(file));
       String s;
       
       while ((s = br.readLine()) != null) {
         String[] str = s.split(",");
         for(int i = 0; i < str.length; i++) rand_number[i] = Integer.parseInt(str[i]);
        }

        br.close();
        
       } catch (IOException e) { System.out.println(e); }
       for (int i = 0; i < MAX; i++) { System.out.print(rand_number[i] + ","); }
     }
   }