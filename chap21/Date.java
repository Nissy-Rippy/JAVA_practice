package chap21;
import java.lang.Cloneable;

public class Date implements Cloneable{
  private Date publishDate;
  
 

  public Date  getPublishDate() { return new Date().getPublishDate(); }
  public void setPublishDate(Date publishDate) { this.publishDate = new Date().publishDate; }
  public Date clone() {
    Date d = new Date();
    d.publishDate = this.publishDate;
    return d;
  }
  public Date getPublishDate2() {
    return null;
  }
  

}
