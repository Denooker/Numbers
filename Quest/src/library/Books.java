package library;

public class Books {
    private int id;
    private String author;
    private String titleOfTheBook;
    private String genre;
    private int shelf;
    private String timeOfIssueBook = ;
    private int timeOfReturn;
    private String whoTake;
    private boolean status;

    Books(int id, String author, String name, String genre){
        this.id = id;
        this.author = author;
        this.titleOfTheBook = name;
        this.genre = genre;
    }

    public int getId(){
        return id;
    }

    public String getAuthor(){
        return author;
    }

    public String getTitleOfTheBook(){
        return titleOfTheBook;
    }

    public String getGenre(){
        return genre;
    }

    public void setShelf(int shelf){
        this.shelf = shelf;
    }

    public int getShelf(){
        return shelf;
    }

    //время взятие книги от библиотекаря
//    public void setTimeOfIssueBook(Librarian l){
//        this.timeOfIssueBook = l.getTimeOfIssueLibrarian();
//    }


    public String getTimeOfIssueBook(){
        return timeOfIssueBook;
    }

    public void setTimeOfReturn(int timeOfReturn){
        this.timeOfReturn = timeOfReturn;
    }

    public int getTimeOfReturn(){
        return timeOfReturn;
    }

    public void setWhoTake(Visitor whoTake){
        this.whoTake = whoTake.getNameOfVisitor();
    }

    public String getWhoTake(){
        return whoTake;
    }

    public void setStatus(boolean status){
        this.status = status;
    }

    public boolean getStatus(){
        return status;
    }
}
