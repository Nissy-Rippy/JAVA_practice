package chap26;

import org.apache.commons.lang3.builder.*;

public class BankUsingEqualsBuilder implements Cloneable, Comparable<BankUsingEqualsBuilder>{
//フィールド
  String title;
  String comment;
  String publishedDate;


  public boolean equals(Object o) {
    //reflectionsEquals はBankクラスが持つ全てのフィールドが等価であることを自動的に調べてくれるのである！

    return EqualsBuilder.reflectionEquals(this, o);//この一行だけで済むようになる！
  }

  public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(this);//Bankクラスの全フィールドから、ハッシュ値を生成できるようになるらしい！/*  */
  }


  public int compareTo(BankUsingEqualsBuilder o) {
    return CompareToBuilder.reflectionCompare(
      this, o, "comment", "title"
    );
  }
}
