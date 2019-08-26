package library;

public class Librarian {

    private String timeOfIssueLibrarian;

    //библиоткерь устанавливает время взятия
    public void setTimeOfIssueLibrarian(Books book, String timeOfIssueLibrarian) {
        this.timeOfIssueLibrarian = timeOfIssueLibrarian;
    }
    public String getTimeOfIssueLibrarian() {
        return timeOfIssueLibrarian;
    }
}
