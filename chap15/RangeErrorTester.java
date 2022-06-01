package chap15;
import java.util.Scanner;

class RangeError extends RuntimeException {
  RangeError(int n) { super("範囲外の値: " + n); }
}

class ParameterRangeError extends RangeError {
 ParameterRangeError(int n) { super(n); }
}

class ResultRangeError extends RangeError {
   ResultRangeError(int n) { super(n); }
}

public class RangeErrorTester {
  //0以上９以下でなければfalse、その間ならtrue35
  public static boolean isValid(int n) {
        return n >= 0 && n <= 9;
      }
      //エラーがお嫌う可能性がある関数の引数と、中身との間に起こりうるエラーの種類を記入しなければならない
  public static int add(int a, int b) throws ParameterRangeError, ResultRangeError {
      if (! isValid(a)) throw new ParameterRangeError(a);
      if (! isValid(b)) throw new ParameterRangeError(b);
      int result = a + b;
      if (! isValid(result)) throw new ResultRangeError(result);
      return result;
}

public static void main(String[] args) {

  Scanner stdIn = new Scanner(System.in);
  System.out.print("整数a : ");  int a = stdIn.nextInt();
  System.out.print("整数b : ");  int b = stdIn.nextInt();
//catchは起こりうるエラーの種類分
  try{
    System.out.println( "それらの和は" + add(a, b) + "で");
  } catch (ParameterRangeError e) {
    System.out.println( "加える数が範囲外です////" + e.getMessage()  );
  } catch (ResultRangeError e) {
    System.out.println( "計算結果が範囲外です////" + e.toString()  );
    System.out.println( "計算結果が範囲外です////" + e.getCause()  );
    System.out.println( "計算結果が範囲外です////" + e.getMessage()  );
  }
}



}
