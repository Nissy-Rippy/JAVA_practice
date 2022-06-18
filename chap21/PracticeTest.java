package chap21;

import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class PracticeTest{
  public static void main(String[] args) throws Exception {
    ArrayList<Book> books = new ArrayList<>();
    //SimpleDateFormat()の引数に自分の表示したいようにyyyy年mm月dd日にちを/で区切って形を作ってあげる。
    SimpleDateFormat f = new SimpleDateFormat("yyyy/mm/dd");
    Book book = new Book();

    Book b1 = new Book();
    b1.setTitle("java入門");
    //f.parse("2323")によって、引数の年を実装されてるメソッドに沿って表示される
    b1.setPublishDate(f.parse("2011/10/07"));
    b1.setComment("スッキリわかる");
    books.add(b1);

    Book b2 = new Book();
    b2.setTitle("java入門");
    b2.setPublishDate(f.parse("2019/06/14"));
    b2.setComment("カレーが食べたくなる");
    books.add(b2);

    Book b3 = new Book();
    b3.setTitle("C言語入門");
    b3.setPublishDate(f.parse("2018/06/24"));
    b3.setComment("明日五兵衛");
    books.add(b3);

    Collections.sort(books, new TitleComparator());

    Collections.sort(books, new TitleComparator());
    //f.formatのfomatメソッドによって引数の(b.getPublishDate());とすることで最初に引数で埋め込んだ形に戻して表示してあげることができる。
    for (Book b : books) {
      System.out.println(b.getTitle() + " " + f.format(b.getPublishDate())+ " " + b.getComment());
    }
  }

  }
