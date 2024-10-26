package librarysystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        Library library = new Library(10); 
        
       
        library.addItem(new Book("1984", "George Orwell", 1, 328));
        library.addItem(new Magazine("Time", "Various", 2, "March 2024"));
        library.addItem(new Book("Brave New World", "Aldous Huxley", 3, 268));

        System.out.println("Welcome to PMFTCILibrary!!!");
         library.displayAvailableItems();

        
        System.out.print("Pumili ng ID ng book o magazine na gusto mong tingnan: ");
        int selectedId = scanner.nextInt();

 
        boolean found = false;
        for (int i = 0; i < library.getItemCount(); i++) {
            if (library.getItems()[i].getId() == selectedId) {
                library.getItems()[i].displayInfo(); 
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Walang item na may ID na " + selectedId);
        }

        scanner.close();
    }
}
