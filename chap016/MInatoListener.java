
import java.awt.event.*;
import java.util.concurrent.TimeUnit;

public class MInatoListener implements ActionListener{
  /* (non-Javadoc)
   * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
   */
  public void actionPerformed(ActionEvent e) {
    System.out.println("押されました！");//コマンドプロントに出力する！
    // ProcessBuilder pb = new ProcessBuilder(command)
    System.out.println("カウントが始まります！");
    for (int i = 10; i <= 0; i--) {
      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException  e2) {
        e2.printStackTrace();
      }
      System.out.println(i + "....");
    }
  }


}
