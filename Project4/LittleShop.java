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
import java.util.*;

public class LittleShop {
    public static void main (String []args){
        Iterator SandwichI = new SandwichShopMenu();
        Iterator SoupI = new SoupShopMenu();
        
        System.out.println("Sandwich Menu");
        showMenu(SandwichI);
        System.out.println("Soup Menu");
        showMenu(SoupI);
        
    }
    private static void showMenu(Iterator iterator){
        while (iterator.hasNextItem()){
            String menuI = (String) iterator.next();
            System.out.println(menuI);
        }
    }
}
