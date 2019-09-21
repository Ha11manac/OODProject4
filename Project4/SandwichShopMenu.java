/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project4;

/**
 *
 * @author pokem
 */
import java.util.ArrayList;

public class SandwichShopMenu implements Iterator {
    ArrayList<String> Items;
    int spot = 0;

    public SandwichShopMenu(){
        Items = new ArrayList<>();
        
        addMenu("Turkey", "$5\n");

        addMenu("Ham", "$4\n");
        
        addMenu("MeatBall", "$6\n");
    }

    public void addMenu(String name, String price){
        Items.add(name);
        Items.add("Price: " + price);
    }


    public ArrayList<String> getMenu() {
        return Items;
    }

    public String toString(){
        return "Sandwich Shop Menu";
    }

    public String next(){
        String mItem = (String) Items.get(spot);
        spot += 1;
        return mItem;
    }

    public boolean hasNextItem() {
        return spot < Items.size();
    }

    //add other options later when needed here
}
