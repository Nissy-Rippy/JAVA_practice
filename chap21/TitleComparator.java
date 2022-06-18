package chap21;

public class TitleComparator {
  public static void main(String[] args) {
    Book book = new Book();
    Date date = new Date();

    book.getPublishDate().equals(date.getPublishDate());

    Collections.sort(book);
  }
}
