package library;

public class Visitor {
    private String timeOfIssueVisitor;//время взятия
    private String nameOfVisitor;//имя посетителя

    Visitor(String nameOfVisitor){
        this.nameOfVisitor = nameOfVisitor;
    }

    //установить время взятия книги
    public void setTimeOfIssueVisitor(Books book){
        this.timeOfIssueVisitor = book.getTimeOfIssueBook();
    }
    public String getTimeOfIssueVisitor(){
        return this.timeOfIssueVisitor;
    }

    //вернуть имя посетителя
    public String getNameOfVisitor(){
        return nameOfVisitor;
    }

}
