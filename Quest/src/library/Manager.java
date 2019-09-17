package library;

public class Manager {

    private boolean statusOfLibrary;//статус библиотеки
    private int shelfManager;//номер полки
    private int numberOfBookManger;//количестов книг

    //добавить книгу в библиотеку, присвоить номер полки
    public void addBookInLibrary(Library library, Books book, int shelfManager, int numberOfBookManger ){
        book.setNumberBook(numberOfBookManger);
        library.getBooks().add(book);
        book.setShelfBook(shelfManager);
        this.shelfManager = shelfManager;
    }

    //вернуть номер полки
    public int getShelfManager(){
        return shelfManager;
    }

    //удалить книгу с библиотеки
    public void removeBookFromLibrary(Library library, int id){
        library.getBooks().remove(id);
    }

    //открыть или закрыть библиотеку
    public void setStatusOfLibrary(boolean statusOfLibrary){
        this.statusOfLibrary = statusOfLibrary;
    }
    //вернуть статус библиотеки
    public boolean getStatusOfLibrary (){
        return this.statusOfLibrary;
    }

    //узнает кто взял книгу
    public String getWhoTakeManager(Books book){
        return book.getWhoTakeBook();
    }

    //узнает когда взяли книгу
    public String getWhenTakeManager(Books book){
        return book.getTimeOfIssueBook();
    }

}
