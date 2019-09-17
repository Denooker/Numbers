package library;

import java.util.ArrayList;

public class Library_Demo {
    public static void main(String[] args) {
        Books HP = new Books(1, "J. K. Rowling", "Harry Potter", "Fantasy" );
        Books IR = new Books(2, "I. Azimov", "I, Robot", "Fantasy" );
        Books SH = new Books(3, "G. D. Roberts", "Shantaram", "Novel" );
        Books TT = new Books(4, "F. Kafka", "The Trial", "Novel" );
        Books ME = new Books(5, "A. Christie", "Murder on the Orient Express", "Detective" );

        ArrayList<Books> booksOnFirstShelf = new ArrayList<>();

        Library first = new Library(booksOnFirstShelf);

        Manager manager = new Manager();
        Librarian librarian = new Librarian();
        Visitor Jim = new Visitor("Jim");
        Visitor Pam = new Visitor("Pam");
        Visitor Mike = new Visitor("Mike");

        manager.addBookInLibrary(first, HP, 110,3);
        manager.addBookInLibrary(first, IR, 120, 1);
        manager.addBookInLibrary(first, SH, 130, 5);
        manager.addBookInLibrary(first, TT, 140, 1);
        manager.addBookInLibrary(first, ME, 150, 6);

        librarian.setStatusLibrarian(HP);
        librarian.setStatusLibrarian(IR);
        librarian.setStatusLibrarian(SH);
        librarian.setStatusLibrarian(TT);
        librarian.setStatusLibrarian(ME);

        librarian.getBooksInAll(first);

        librarian.setTimeOfIssueLibrarian(HP,"12-00-00");
        librarian.setTimeOfReturnLibrarian(HP,"15-00-00");
        librarian.setWhoTakeLibrarian(HP,Jim);
        librarian.setStatusLibrarian(HP);

        System.out.println(librarian.getHowMuchBooksInAll(first));
        System.out.println(librarian.getWhereBook(TT));
        System.out.println(HP.getStatusBook());
    }
}
