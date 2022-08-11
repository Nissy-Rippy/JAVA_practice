import java.awt.print.Book;
import java.util.*;
import java.util.Objects;

public class Bank implements Comparable<Bank>, Cloneable {
  private String name;
  private Date publishDate;
  private String comment;


  public void setPublishDate(Date publishDate) {
    this.publishDate = publishDate;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public Date getPublishDate() {
    return this.publishDate;
  }

  public String getComment() {
    return this.comment;
  }

  public String getName() {
    return this.name;
  }
  

  public int hashCode() {
    return Objects.hash( this.name, this.publishDate, comment );
  }

  public Bank clone() {
    Bank book = new Bank();
    book.name = this.name;
    book.publishDate = (Date)publishDate.clone();
    book.comment = this.comment;
    return book;
  }
  public int compareTo(Bank obj) {
    // if ( this.publishDate < obj.publishDate) {
    //   return -1;
    // }  else if ( this.publishDate > obj.publishDate) {
    //   return 1;
    // } else {
    //   return 0;
    // }
   return this.publishDate.compareTo(obj.publishDate);


  }
}
