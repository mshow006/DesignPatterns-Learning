package _01iterator;

import java.util.NoSuchElementException;

/**
 * 书架遍历器
 *
 * @author Liu Yingming on 2019/5/31
 */
public class BookShelfIterator implements Iterator {
    // 遍历的书架
    private BookShelf bookShelf;
    // 迭代器当前所指向的书的下标
    private int index;

    BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < bookShelf.getLength();
    }

    @Override
    public Object next() {
        if (index >= bookShelf.getLength()) {
            throw new NoSuchElementException("没有数据");
        }
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
