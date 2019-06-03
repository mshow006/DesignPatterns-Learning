package _02iterator;

import java.util.ArrayList;

/**
 * 书架类
 *
 * @author Liu Yingming on 2019/5/31
 */
public class BookShelf implements Aggregate {
    // private Book[] books;
    private ArrayList<Book> bookArrayList;
    // private int last = 0;

    BookShelf(int maxsize) {
        // this.books = new Book[maxsize];
        this.bookArrayList = new ArrayList<>(maxsize);
    }

    Book getBookAt(int index) {
        // return books[index];
        return bookArrayList.get(index);
    }

    void appendBook(Book book) {
        this.bookArrayList.add(book);
        // this.books[last] = book;
        // last++;
    }

    int getLength() {
        // return last;
        return bookArrayList.size();
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
