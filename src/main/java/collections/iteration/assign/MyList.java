package collections.iteration.assign;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class MyList<T>{

    private T[] elements;
    private int sze = 10, idx = 0;

    public MyList() {
        elements  = (T[]) new Object[sze];
    }

    public void add(T element){
        if(!(idx < sze)){
            increment();
        }
        elements[idx++] = element;
    }


    public int length(){
        return idx;
    }

    private void increment(){
        T[] elementsTemp = elements;
        sze*=2;
        elements = (T[]) new Object[sze];
        copyElements(elementsTemp);
    }

    private void copyElements(T[] elementsTemp) {
        for (int i = 0; i < elementsTemp.length ; i++) {
            elements[i] = elementsTemp[i];
        }
    }

    public void removeElement(int index){
        elements[index] = null;
        for(int i = index; i<idx; i++){
            elements[i] = elements[i+1];
        }
        idx-=1;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < idx ; i++) {
            stringBuilder.append("\n"+elements[i].toString());
        }
        return stringBuilder.toString();
    }

    private class IteratorImpl implements Iterator<T>{
        int cursor = 0, lastRet = Integer.MIN_VALUE;


        @Override
        public boolean hasNext() {
            return cursor!=sze;
        }

        @Override
        public T next() {
            T next = elements[cursor];
            if(next!= null){
                cursor+=1;
                return next;
            }else{
                throw new NoSuchElementException();
            }
        }

        @Override
        public void remove() { //Not implemented yet.
            if(lastRet == Integer.MIN_VALUE){
                throw new IllegalStateException();
            }
        }

        @Override
        public void forEachRemaining(Consumer<? super T> action) {
            Iterator.super.forEachRemaining(action);
        }
    }
}