package library;

public class Librarian {

    private String timeOfIssueLibrarian;//время взятия книги
    private String timeOfReturnLibrarian;//время возврата
    private String whoTakeLibrarian;//кто взял книгу
    private boolean statusLibrarian = false;//есть ли книги

    //установить время взятия книги
    public void setTimeOfIssueLibrarian(Books book, String timeOfIssueLibrarian) {
        book.setTimeOfIssueBook(timeOfIssueLibrarian);
        this.timeOfIssueLibrarian = timeOfIssueLibrarian;
    }
    public String getTimeOfIssueLibrarian() {
        return timeOfIssueLibrarian;
    }

    //установить время возврата книги
    public void setTimeOfReturnLibrarian(Books book, String timeOfReturnLibrarian) {
        book.setTimeOfReturnBook(timeOfReturnLibrarian);
        this.timeOfReturnLibrarian = timeOfReturnLibrarian;
    }
    public String getTimeOfReturnLibrarian() {
        return timeOfReturnLibrarian;
    }

    //установить кто взял книгу
    public void setWhoTakeLibrarian(Books book, Visitor whoTakeLibrarian) {
        book.setWhoTakeBook(whoTakeLibrarian.getNameOfVisitor());
        this.whoTakeLibrarian = whoTakeLibrarian.getNameOfVisitor();
    }
    public String getWhoTakeLibrarian() {
        return whoTakeLibrarian;
    }

    //установить наличие книг
    public void setStatusLibrarian(Books book){
        if(book.getNumberBook()>0){
            book.setStatusBook(true);
            this.statusLibrarian = true;
            return;
        }
        book.setStatusBook(false);
    }
    public boolean getStatusLibrarian(){
        return this.statusLibrarian;
    }

    //вернуть количество книг в библиотеке
    public int getHowMuchBooksInAll(Library library){
        return library.getBooks().size();
    }

    //вернуть полку книги
    public int getWhereBook(Books book){
        return book.getShelfBook();
    }

    //посмотреть книги
    public void getBooksInAll(Library library){
        for(Books books: library.getBooks()){
            System.out.println(books.getTitleOfTheBook() + " - " + books.getNumberBook());
        }
    }

}
