package _01iterator;

/**
 * 测试
 *
 * @author Liu Yingming on 2019/5/31
 */
public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("AAA"));
        bookShelf.appendBook(new Book("BBB"));
        bookShelf.appendBook(new Book("CCC"));
        bookShelf.appendBook(new Book("DDD"));
        bookShelf.appendBook(new Book("EEE"));
        bookShelf.appendBook(new Book("FFF"));
        bookShelf.appendBook(new Book("GGG"));
        bookShelf.appendBook(new Book("HHH"));
        bookShelf.appendBook(new Book("III"));
        Iterator it = bookShelf.iterator();
        // while 循环不依赖于 BookShelf 的实现
        // 假设 BookShelf 不使用数组来存储书本，而是用 Vector，那么 BookShelf 的 _01iterator() 依然可以返回 Iterator.md 实例
        // hasNext() 和 next() 方法可以正常使用
        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }
}
