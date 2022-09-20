import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel {
  JFrame frame = new JFrame();
  JButton button1 = new JButton("ログイン");
  JButton button2 = new JButton("クリア");


  public ButtonPanel(IDPanel idpanel, PWPanel pwpanel) {
    this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
    button1.addActionListener((e) -> {
      if (idpanel.getText().equals("minato") && pwpanel.getText().equals("yusuke")) {
        JOptionPane.showMessageDialog(this, "ログイン成功！！", "エラー発生！", JOptionPane.INFORMATION_MESSAGE);
      } else {
        JOptionPane.showMessageDialog(this, "ログインできませんでした！", "ログイン失敗！", JOptionPane.ERROR_MESSAGE);
      }
    });
    button2.addActionListener(e -> {
      idpanel.setText("");
      pwpanel.setText("");
    });
    this.add(button1);
    this.add(button2);
    this.setting();
  }

  public void setting() {
    frame.setSize(30, 50);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }

}
