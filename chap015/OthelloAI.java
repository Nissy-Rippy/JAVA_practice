/**
 * オセロAI作成のクラス
 */

public interface OthelloAI {
  /**
   * 現在の番の状態から、次に打つ場所を決める処理
   * 
   * @param  board 現在の盤の状態(8ｘ8のint配列)0 = なし, 1 = 白, 2 = 黒
   * @return  次に石を打つべきx座標とy座標を格納した要素数２の配列
   * 
   */
  public int[] decide(int[] [] board);

}
