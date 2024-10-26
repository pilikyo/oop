package librarysystem;

public class Magazine extends LibraryItem {
    private String issue;

    public Magazine(String title, String author, int id, String issue) {
        super(title, author, id);
        this.issue = issue;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Issue: " + issue);
    }
}
