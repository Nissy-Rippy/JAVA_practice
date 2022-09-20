import java.awt.BorderLayout;
import java.awt.*;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.Border;

public class PWPanel extends JPanel {

  JLabel label2 = new JLabel("パスワード");
  JPasswordField pf = new JPasswordField(6);

  public PWPanel() {
    this.setLayout(new BorderLayout());
    this.add(label2, BorderLayout.WEST);
    this.add(pf, BorderLayout.CENTER);
    this.hideText();
    // pf.setEchoChar((char)'★');
    // pf.setEchoChar((char)0);
    // this.add(pf, BorderLayout.EAST);
    
  }

  public void hideText() {
    pf.setEchoChar('★');
  }
  // Jpanel panel = new Jpanel();
  // panel.add(label2);
  // panel.add(label2);
  // panel.add(label2);

  // Container contentPane = getContentPane();
  // contentPane.add(panel, BorderLayout.CENTER);
  
}
