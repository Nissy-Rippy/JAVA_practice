import java.awt.FlowLayout;
import javax.swing.*;



public class Main6 {
  public static void main(String[] args) {

    JFrame jframe = new JFrame("ログイン画面");//タグの名前ー！
    jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//バツボタンでウィンドウを閉じる設定
    jframe.setSize(400, 200);
  //setLocationRelativeToをnullに設定することで、デフォルトでセンターに設定する
    jframe.setLocationRelativeTo(null);
    //BoxLayoutの形式のframe.getContentPane()の縦置きということで、
    jframe.setLayout(new BoxLayout(jframe.getContentPane(), BoxLayout.Y_AXIS));

    IDPanel idpanel = new IDPanel();
    PWPanel pwpanel = new PWPanel();
    jframe.add(idpanel);
    jframe.add(pwpanel);
    jframe.add(new CheckPanel(pwpanel));
    jframe.add(new ButtonPanel(idpanel, pwpanel));
    
    // jframe.add(new IDPanel());
    // jframe.add(new PWPanel());

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
