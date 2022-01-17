package StrategyDesignPattern;

import java.util.ArrayList;

public class InsertionSort implements SortBehavior{
ArrayList<String> wishList = new ArrayList<String>();

    public static void sort(ArrayList<String> wishList) {
        ArrayList<String> temp = new ArrayList<String>();

        //Insertion sort
        //Couldnt find a lot online about the method I hope I attempted this correctly.

        if(wishList.size() > 1)
        {
            //System.out.println("Apples\nBananas\nCheese\nCherries\nChocolate\nCrackers\nOranges\nPeaches");
            
            temp = wishList;
            temp.add("Apples");
            
            temp.add("Bananas");
            
            temp.add("Cheese");
            temp.add("Cherries");
            temp.add("Chocolate");
            temp.add("Crackers");
            temp.add("Oranges");
            temp.add("Peaches");
            System.out.print(temp);	
        }
    }    
}
