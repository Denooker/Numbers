package library;

import java.util.ArrayList;

public class Library {

    private ArrayList<Books> books;//коллекция для хранения книг

    Library(ArrayList<Books> b){
        books = b;
    }

    public ArrayList<Books> getBooks(){
        return books;
    }
}
