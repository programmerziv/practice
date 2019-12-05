package iterator;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements Aggregate {

    List<Book> books ;

    public BookShelf(){
        this.books = new ArrayList<Book>(16);
    }

    public Book getBookAt(int index){
        if(index < books.size()){
            return books.get(index);
        }
        return null;
    }

    public void appendBook(Book book){
        this.books.add(book);
    }

    public int getLength(){
        return this.books.size();
    }

    // 精华所在
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
