package chap21;

import java.lang.Cloneable;
import java.lang.Comparable;
import java.util.*;

public class Book implements Comparable<Book>, Cloneable{

  private String title;
  private Date publishDate;
  private String comment;

  public String getTitle() { return this.title; }
  public Date getDate(int publishDate) { return new Date(publishDate); }
  public String getComment() { return this.comment; }
  
  public void setTitle(String title) { this.title = title; }
  public void setDate(int publishDate) { this.publishDate = new Date(publishDate); }
  public void setComment(String comment) { this.comment = comment; }
  
  public int compare()

  public boolean equals(Object o) {
    if(o == this.title) { return true; }
    if (o != this.title) { return false; }
    if ( o == null ) { return false; }
    if (!(o instanceof Date)) { return false; }
    Date r = (Date)o;
    if (!this.title.trim().equals(r.getPublishDate.trim())) { return false; }
    return true;
  }

  public int compare(Date obj) {
    if (this.publishDate < obj.publishDate) { return 1; }
    if (this.publishDate > obj.publishDate) { return -1; }
    return 0;
  }

  public Book clone() {
    Book b = new Book();
    b.title = this.title;
    b.comment = this.comment;
    b.publishDate = new Date().clone();
    return b;
  }

}
