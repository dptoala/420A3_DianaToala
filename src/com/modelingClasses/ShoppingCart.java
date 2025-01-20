package com.modelingClasses;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items;

    //Constructor
    public ShoppingCart(){
        this.items = new ArrayList<>();
    }

    //Functions
    public void AddItem(Item item){
        items.add(item);
    }
    public void RemoveItem(Item item){
        items.remove(item);
    }
    public double GetTotalPrice(){
        double total = 0.0;
        for (Item i: items)
        {
            total += i.GetPrice();
        }
        return total;
    }
}
