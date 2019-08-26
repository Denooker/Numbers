package library;

public class Visitor {
    private String timeOfIssueVisitor;
    private String nameOfVisitor;

    Visitor(String nameOfVisitor){
        this.nameOfVisitor = nameOfVisitor;
    }

    //время взятие книги от объекта книги
    public void setTimeOfIssue(Books book){
        this.timeOfIssueVisitor = book.getTimeOfIssueBook();
    }

    public String getNameOfVisitor(){
        return nameOfVisitor;
    }
}
