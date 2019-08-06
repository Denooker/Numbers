package genstack;

import java.util.Objects;

public class GenStack<T> implements IGenStack<T> {
    private int tos;
    private T stck[];

    GenStack(T[] stckArray){
        stck = stckArray;
        tos = 0;
    }

    GenStack(T[] stckArray, GenStack<T> ob){
        tos = ob.tos;
        stck = stckArray;
        try {
            if (stck.length < ob.stck.length)
                throw new StackFullException(stck.length);
        } catch (StackFullException exc){
            System.out.println(exc);
        }

        for(int i = 0; i < tos; i++){
            stck[i] = ob.stck[i];
        }
    }

    GenStack(T[] stckArray, T[] a){
        stck = stckArray;
        try {
            for (int i = 0; i < a.length; i++) {
                push(a[i]);
            }
        } catch (StackFullException exc){
            System.out.println(exc);
        }
    }

    public void push(T ch) throws StackFullException{
        if (tos == stck.length){
            throw new StackFullException(stck.length);
        }
        stck[tos] = ch;
        tos++;
    }

    public T pop() throws StackEmptyException{
        if (tos == 0) {
            throw new StackEmptyException();
        }
        tos --;
        return stck[tos];
    }
}
