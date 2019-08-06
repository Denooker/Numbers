package genstack;

public class StackFullException extends Exception {
    int size;
    StackFullException (int size){
        this.size = size;
    }

    public String toString(){
        return "\nСтек заполнен. Максимальный размер стека: " + size;
    }
}
