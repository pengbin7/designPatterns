package com.pb.design_patterns.iterator;

/**
 * 书架类
 * @author pengbin
 * @date 2019/5/9
 */
public class BookShelf implements Aggregate {

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }

    private Book[] books;

    private int index;

    /**
     * 新增书籍
     */
    public void appendBook(Book book){
        books[index++] = book;
    }

    public int size() {
        return books.length;
    }

    public Book getAt(int index) {
        return books[index];
    }
}
