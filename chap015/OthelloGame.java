import java.util.WeakHashMap;

public class OthelloGame {
  public static void main(String[] args) {
    System.out.println("オセロゲームを開始します！");
    int[][] board = new int[8][8];
    OthelloAI ai = null;
    System.out.println("コンピューターの強さを選んでください！！" + "(1 = 弱い, 2 = 普通, 3 = その他)" );
    
    int cpuno = new java.util.Scanner(System.in).nextInt();
    do {
    if (cpuno == 1) {
      ai = new WealOthelloAI();
    } else if (cputno == 2) {
      ai = new StrongOthelloAI();
    } else if (cpunot == 3) {
      //このその他機能を作ることによって、汎用性が高くなりより自由にかつ、コード修正を伴わなくて済むような設計になっている。
      System.out.println("人工知能クラスのFQCNを入力多くしてください");
      String fqcn = new java.util.Scanner(System.in).nextLine();
      Class<?> clazz = Class.forName(fqcn);
      ai = (OthelloAI)clazz.newInstance();
    } else {
      System.out.println("無効な数値です。再入力してください");
      // cpuno = new java.util.Scanner(System.in).nextInt();
    }
  } while (cpuno != 1 && cpuno != 2);

  while (true) {
    System.out.println("あなたの番: 打つ場所を決めてください");
    System.out.println("私の番: 打つ場所を決めてください");
    int[] nextStone = ai.decide(board);
  }

  }
}
