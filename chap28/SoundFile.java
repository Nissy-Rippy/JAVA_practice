import javax.sound.midi.*;
import javax.sound.sampled.*;
import java.io.*;
import java.util.*;

public class SoundFile {
  public static void main(String[] args) throws Exception {
    //MIDIでVGMを再生する新せさーざ（シーケンサ）の準備
    Sequencer seq = MidiSystem.getSequencer();//closeを最後にする必要性がある
    seq.open();//シーケンサを開かないと使えない
    //setSequence(MidiSystem.getSequence)でファイル名を選び選択する
    seq.setSequence(MidiSystem.getSequence( new File("xmas-bgm.mid") ));

    seq.setLoopCount(-1);//-1にすることでループ再生を行わないようにしている。
    seq.start();//演奏を開始する

    //クリスマスソングの音をＷＡＶから読み取る用意を行う！
    AudioInputStream ais = AudioSystem.getAudioInputStream(new File("xmas-bell.wav"));//まずは、ファイルを読み込む
    Clip clip = AudioSystem.getClip();//getClipによってfail再生機能の代入
    clip.open(ais);//ファイルの再生

    System.out.println("メリークリスマス");
    System.out.println("なにか入力すると三回だけベルがなるよ！");
    

    for (int i = 0; i < 4; i++) {
      new Scanner(System.in).nextLine(); //任意の数の入力
      clip.satrt();//演奏の開始
      clip.setFramePosition(0);//始まるフレームの位置！初めから再生なので0になっている。

      clip.stop();//音声再生の終了
      ais.close();//クリスマスファイルを閉じる
      seq.stop();//シーケンサも使い終わったのでストップして閉じる必要がある。
      seq.close();
    }
  }
}
// //必要なものは、
// 自由に使用できる音素材のBGM用のmidiファイルとベル用ｍｐ3ファイルを準備
// そしてプログラムと同じフォルダに配置して実行するとできる！！