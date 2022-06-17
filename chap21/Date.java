package chap21;
import java.lang.Cloneable;

public class Date implements Cloneable{
  private int publishDate;

  public int getPublishDate() { return this.publishDate; }
  public void setPublishDate(int publishDate) { this.publishDate = publishDate; }

}
