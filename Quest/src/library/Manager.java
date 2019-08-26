package library;

import java.util.ArrayList;

public class Manager {

    public void addBookOnShelf(ArrayList<Books> shelf, Books book){
        shelf.add(book);
    }

    public void removeBookOnShelf(ArrayList<Books> shelf, int id){
        shelf.remove(id);
    }

    private boolean statusOfLibrary;

    public void setStatusOfLibrary(boolean statusOfLibrary){
        this.statusOfLibrary = statusOfLibrary;
    }


}
