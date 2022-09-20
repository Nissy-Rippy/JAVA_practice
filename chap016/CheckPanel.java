import javax.swing.JPanel;
import java.lang.Object;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import javax.swing.JComponent;
import javax.swing.JToggleButton;
import javax.swing.event.MouseInputAdapter;

import org.w3c.dom.events.MouseEvent;
import javax.swing.JCheckBox;

public class CheckPanel extends JPanel {
  JCheckBox check = new JCheckBox("パスワードを隠さない");
  
  //コンストラクタにpasswordのパネルを引数にしてあげることで、CheckPanelとPWPanelをつなげてあげる！！
  public CheckPanel(PWPanel pfpanel) {
    this.setLayout(new BorderLayout());
    this.add(check, BorderLayout.WEST);
    //ボタンをくっつけたあとに効力を書く！もしクリックされたらどう動くのかというところ！

    check.addActionListener((e) -> {
      // ボタンが選択されているかどうかを判定します。押されているときはtrueが帰ってくる！！
      if (check.isSelected()) {
      pfpanel.showText();
      } else { pfpanel.hideText(); }

    }
    );
  }
 
}