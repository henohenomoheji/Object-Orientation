public class BookShelf implements Aggregate{
    private Book[] books;
    private int last = 0;
    public BookShelf(int maxsize){
        this.book = new Book[maxsize];//わからない
    }
    public Book getBookAt(int index){
        return books[index];
    }
    public void appendBook(Book book){
        this.bools[last] = book;
        last++;
    }
    public int getLength(){
        return last;
    }
    public Interator interator(){
        return new BookShelfInterator(this);
}