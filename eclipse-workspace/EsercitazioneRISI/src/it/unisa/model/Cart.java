package it.unisa.model;

import java.util.ArrayList;

public class Cart<T> {
    private ArrayList<T> items;

    public Cart(){
        items = new ArrayList<T>();
    }

    public void addItem(T item){
        if(item != null)
            items.add(item);
    }

    public void deleteItem(T item){
        if(item != null)
            items.remove(item);
    }

    public ArrayList<T> getItems(){
        return items;
    }

    public void deleteItems(){
        items.clear();
    }
}
