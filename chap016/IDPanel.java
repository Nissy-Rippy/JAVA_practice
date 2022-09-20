import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class IDPanel extends JPanel {
  JLabel label = new JLabel("ユーザーID");
  JTextField id = new JTextField();
//Panelの設定ここで、コンストラクタによって作られたパネルをMainでaddによってくっつけるイメージ！

  public IDPanel() {
    this.setLayout(new BorderLayout());
    this.add(label, BorderLayout.WEST);
    this.add(id, BorderLayout.CENTER);
  }
  public String getText() {
    return this.id.getText();//getText　文字列を変換するメソッド！
  }
  public void setText(String newText) {//文字列セットのsetterみたいな感じ！
    this.id.setText(newText);
  }


}
