import java.awt.FlowLayout;
import javax.swing.*;



public class Main6 {
  public static void main(String[] args) {

    JFrame jframe = new JFrame("ログイン画面");
    jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//バツボタンでウィンドウを閉じる設定
    jframe.setSize(400, 200);
    jframe.setLocationRelativeTo(null);
    jframe.setLayout(new BoxLayout(jframe.getContentPane(), BoxLayout.Y_AXIS));
    
    jframe.add(new IDPanel());
    jframe.add(new PWPanel());
    // jframe.add(new CheckPanel());
    // jframe.add(new ButtonPanel());
    
    
    // JLabel label1 = new JLabel("ユーザーID");
    
    // jframe.add(label);

    // JLabel label2 = new JLabel("パスワード");

    // jframe.add(labe2);

    // JLabel label3 = new JLabel("パスワードを隠さない");

    // jframe.add(labe3);

    jframe.setVisible(true);

  }
}
