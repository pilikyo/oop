package librarysystem;
public class Book extends LibraryItem {
    private int pageCount;

    public Book(String title, String author, int id, int pageCount) {
        super(title, author, id);
        this.pageCount = pageCount;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Pages: " + pageCount);
    }
}

