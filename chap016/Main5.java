import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*;
import java.nio.file.*;
import java.io.*;


public class Main5 {
  public static void main(String[] args) {
    
    JFrame frame = new JFrame("初めてのSwing");//バーの文字をここで設定している。
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //setDefaultClosePoerationによって、バツでクローズすることができるようになる
    frame.setSize(400, 200); //JFrameのサイズの大きさをこのメソッドで決めている。！
    frame.setLayout(new FlowLayout() );//ここでレイアウトの種類を決める！
    
    JLabel label = new JLabel("Hello ! World!!");// ラベルの設定引数に表示したい文字をかく。
    frame.add(label);//JFrameに追加雨するときはaddを利用すること！
    JButton button = new JButton("押してね！");//JFrameにボタンを追加するときはJButtonを利用し、ボタンの文字を引数に入れること
    //addActionListener()を使う事によって、ボタンをクリックした際の動作をここで決定している。
      
    button.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          try (
            BufferedReader br = Files.newBufferedReader(Paths.get("rpg.txt"));
            ) {
              label.setText(br.readLine());
            } catch (IOException ae) {
              JOptionPane.showMessageDialog(frame,
              "rpg.txdファイルを開けませんでした！",
              "エラー発生", JOptionPane.ERROR_MESSAGE);
            };
      });
　　　　
    frame.add(button);
    frame.setVisible(true);
    System.out.println("フレームを表示");

    }
  }

