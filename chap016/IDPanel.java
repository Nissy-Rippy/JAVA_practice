import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class IDPanel extends JPanel {
  JLabel label = new JLabel("ユーザーID");
  JTextField id = new JTextField();

  public IDPanel() {
    this.setLayout(new BorderLayout());
    this.add(label, BorderLayout.WEST);
    this.add(id, BorderLayout.CENTER);
  }
}
