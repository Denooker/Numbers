package Cods;

public class Gen<T,V> {
    public T ob;
    public V og;

    Gen (T ob){
        this.ob = ob;
    }

    Gen (V og){
        this.og = og;
    }

    public T getter (){
        return ob;
    }
    public V gett (){
        return og;
    }

}
