package com.pb.design_patterns.iterator;

/**
 * 迭代器实现类
 * @author pengbin
 * @date 2019/5/9
 */
public class BookShelfIterator implements Iterator{

    private BookShelf bookShelf;

    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index >= bookShelf.size();
    }

    @Override
    public Object next() {
        Book book = bookShelf.getAt(index);
        index++;
        //return bookShelf.getAt(index++);
        return book;
    }
}
