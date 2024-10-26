package librarysystem;

public class Library {
    private LibraryItem[] items;
    private int itemCount;

    public Library(int capacity) {
        items = new LibraryItem[capacity];
        itemCount = 0;
    }

    public void addItem(LibraryItem item) {
        if (itemCount < items.length) {
            items[itemCount++] = item;
        } else {
            System.out.println("Library is full!");
        }
    }

    public void displayAvailableItems() {
        System.out.println("Available Items in Library:");
        for (int i = 0; i < itemCount; i++) {
            items[i].displayInfo();
            System.out.println(); 
        }
    }

    public LibraryItem[] getItems() {
        return items;
    }

    public int getItemCount() {
        return itemCount;
    }
}


