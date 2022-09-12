
import javax.swing.*;


import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

public class Main3 {
  public static void main(String[] args) {

    JFrame frame = new JFrame("はじめてのSwing");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 200);
    
    //ウィジェット追加の準備！！！
    // frame.setLayout( new FlowLayout() );
    // frame.setLayout(null);  レイアウトを全部自分で決めようとするときはnullにすることによって可能になる！

    frame.setLayout( new BoxLayout(ContentPane, BoxLayout.Y_AXIS));

    JLabel label = new JLabel("Hello World!!");//ラベルを生成してフレームに追加する
    // label.setLocation(10, 10);
    // label.setSize(200, 20);  nullの時だけに使える！！
    frame.add(label);//追加はadd
    JTextArea textarea = new JTextArea();
    // textarea.setLocation(50, 10);
    // textarea.setSize(200, 20);    setLayout(null)の時に自分で位置を決めるときに設定する！！
    frame.add(textarea);
    JLabel label2 = new JLabel("password");
    // label2.setLocation(100, 200);
    // label2.setSize(100, 20);
    frame.add(label2);
    JPasswordField password = new JPasswordField();
    // password.setLocation(50, 200);
    // password.setSize(100,20);
    frame.add(password);
    JButton buttonN = new JButton("押してね！");//ボタンを生成してフレームに追加する！
    // button.setLocation(250, 30);
    // button.setSize(100, 20);
    frame.add(buttonN);//追加はaddだよー！
    JButton buttonS = new JButton("下ボタン");
    frame.add(buttonS);// 追加はaddだよー！
    JButton buttonW = new JButton("左ボタン！");
    frame.add(buttonW);// 追加はaddだよー！
    JButton buttonE = new JButton("右ボタン！");
    frame.add(buttonE);// 追加はaddだよー！
      

    frame.setVisible(true);
    System.out.println("フレームワークを表示");



  }
}
