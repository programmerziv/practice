package iterator;

public class IteratorMain {

    public static void main(String[] args) {

        Book book1 = new Book();
        book1.setName("十万个为什么！");
        Book book2 = new Book();
        book2.setName("十万个冷笑话！");
        Book book3 = new Book();
        book3.setName("十万个加油啊！");

        BookShelf bookShelf = new BookShelf();
        bookShelf.appendBook(book1);
        bookShelf.appendBook(book2);
        bookShelf.appendBook(book3);

        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()){
            Book book = (Book)iterator.next();
            System.out.println("===="+book.getName()+"====");
        }
    }
}
