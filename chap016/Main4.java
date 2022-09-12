
import java.awt.FlowLayout;
import javax.swing.*;

import org.w3c.dom.events.MouseEvent;

import java.awt.event.*;
public class Main4 {
  public static void main(String[] args) {
    JFrame frame = new JFrame("初めてのSWINGその55！");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 200);
    frame.setLayout(new FlowLayout());

    JLabel label = new JLabel("Hello!! World");
    frame.add(label);
    JButton button = new JButton("押してね！");
    // button.addActionListener(new MInatoListener());


    // button.addActionListener(new ActionListener() {
    //   public void actionPerformed(ActionEvent e) {
    //     System.out.println("おじいちゃんの登場です！！");
    //   }
    // });

    //ラムダ式で書くこともできる！
    button.addActionListener( (e) -> System.out.println("おやじのことか？" ) );

    //MouseListenerはインターフェイスであり、5つのメソッドを全て実装する必要があります！

    button.addMouseListener(new MouseListener() {
      public void mouseClicked(MouseEvent e) {
        System.out.println("クリックされました！");
      }
      public void mousePressed(MouseEvent e) { }
      public void mouseReleased(MouseEvent e){ }
      public void mouseEntered(MouseEvent e) { }
      public void mouseEntered(MouseEvent e) { }
      public void mouseExited(MouseEvent e) { }
    });

    button.addMouseListener(new MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        System.out.println("クリックされましたーーーー！！");
      }
    });
    frame.add(button);

    frame.setVisible(true);
    System.out.println("フレーム表示!");

    }
}
