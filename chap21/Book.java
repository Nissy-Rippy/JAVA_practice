package chap21;
// import java.util.Arrays;
// import java.util.Objects;
// import java.lang.Cloneable;
// import java.lang.Comparable;
import java.util.*;

public class Book implements Comparable<Book>, Cloneable{

  private String title;
  private Date publishDate;
  private String comment;

  public String getTitle() { return this.title; }
  public Date getPublishDate() { return new Date().getPublishDate(); }
  public String getComment() { return this.comment; }
  
  public void setTitle(String title) { this.title = title; }
  public void setDate(int publishDate) { this.publishDate = new Date().getPublishDate(); }
  public void setComment(String comment) { this.comment = comment; }
  //書き忘れた！：ｗ：Objects.hash
  public int hashCode() { return Objects.hash(this.title, this.publishDate, this.comment); }
  
  // public boolean equals(Object o) {
  //   if(o == this.title) { return true; }
  //   if (o != this.title) { return false; }
  //   if ( o == null ) { return false; }
  //   if (!(o instanceof Date)) { return false; }
  //   Date r = (Date)o;
  //   if (!this.title.trim().equals(r.getPublishDate())) { return false; }
  //   return true;
  // }

//正解はこちら！

public boolean equals(Object o) {
  if (this == o) { return true; }
  if (o == null) { return false; }
  if (!(o instanceof Book)) { return false; }
  Book b = (Book)o;
  if (!publishDate.equals(b.publishDate)) { return false; }
  if (!title.equals(b.title)) { return false; }
  return true;
}

//自分の回答
  // public int compareTo(Book obj) {
  //   if (this.publishDate < obj.getPublishDate() ) { return 1; }
  //   if (this.publishDate > obj.getPublishDate() ) { return -1; }
  //   return 0;
  // }
// こっちが正解

public int compareTo(Book o) {
  return this.publishDate.compareTo(o.publishDate);
}
//自分の回答
  // public Book clone() {
  //   Book b = new Book();
  //   b.title = this.title;
  //   b.comment = this.comment;
  //   b.publishDate = new Date().clone().getPublishDate();
  //   return b;
  // }

  //こちらが模範解答
  public Book clone() {
    Book b = new Book();
    b.title = this.title;
    b.comment = this.comment;
    b.publishDate = (Date)this.publishDate.clone();
    return b;
  }

  //ここに書いていた！！
  public int hashCode() {
    return Objects.hash(this.title, this.publishDate, this.comment);
  }

  public String toString() {
    return "本のタイトル: " + this.title + " ほんの出版日" + this.publishDate + "  本のコメント" + this.comment;
  }

}
