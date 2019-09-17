package library;

public class Books {
    private int id;//идентификационный номер книги
    private String author;//автор книги
    private String titleOfTheBook;//название книги
    private String genre;//жанр книги
    private int shelfBook;//номер полки
    private String timeOfIssueBook;//время взятия
    private String timeOfReturnBook;//время возврата
    private String whoTakeBook;//кто взял
    private boolean statusBook;//есть ли книга в наличии
    private int numberBook;//количество книг

    Books(int id, String author, String name, String genre){
        this.id = id;
        this.author = author;
        this.titleOfTheBook = name;
        this.genre = genre;
    }

    //вернуть id книги
    public int getId(){
        return id;
    }

    //вернуть автора книги
    public String getAuthor(){
        return author;
    }

    //вернуть название книги
    public String getTitleOfTheBook(){
        return titleOfTheBook;
    }

    //вернуть жанр книги
    public String getGenre(){
        return genre;
    }

    //установить книгу на полку
    public void setShelfBook(int shelfBook){
        this.shelfBook = shelfBook;
    }
    public int getShelfBook(){
        return shelfBook;
    }

    //установить время взятия
    public void setTimeOfIssueBook(String timeOfIssueBook ){
        this.timeOfIssueBook = timeOfIssueBook;
    }
    public String getTimeOfIssueBook(){
        return this.timeOfIssueBook;
    }

    //установить время возврата
    public void setTimeOfReturnBook(String timeOfReturnBook){
        this.timeOfReturnBook = timeOfReturnBook;
    }
    public String getTimeOfReturnBook(){
        return this.timeOfReturnBook;
    }

    //установить кто взял книгу
    public void setWhoTakeBook(String whoTakeBook){
        this.whoTakeBook = whoTakeBook;
    }
    public String getWhoTakeBook(){
        return this.whoTakeBook;
    }

    //установить есть ли книга в наличии
    public void setStatusBook(boolean statusBook){
        this.statusBook = statusBook;
    }
    public boolean getStatusBook(){
        return this.statusBook;
    }

    //установить количество книг
    public void setNumberBook(int numberBook){
        this.numberBook = numberBook;
    }
    public int getNumberBook() {
        return numberBook;
    }
}
