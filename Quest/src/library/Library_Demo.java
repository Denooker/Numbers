package library;

import java.util.ArrayList;

public class Library_Demo {
    public static void main(String[] args) {
        Books HP = new Books(1, "J. K. Rowling", "Harry Potter", "Fantasy" );
        Books IR = new Books(2, "I. Azimov", "I, Robot", "Fantasy" );

        ArrayList<Books> booksOnFirstShelf = new ArrayList<>();
        booksOnFirstShelf.add(HP);
        booksOnFirstShelf.add(IR);

        Shelfs first = new Shelfs(booksOnFirstShelf);

        Librarian librarian = new Librarian();
        Visitor visitor1 = new Visitor("Jim");

        librarian.setTimeOfIssueLibrarian(HP,"12-00-00");

        HP.setWhoTake(visitor1);
        System.out.println(HP.getTimeOfIssueBook());

    }
}
