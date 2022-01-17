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
            temp.add("Bike");
            
            temp.add("Boat");
            
            temp.add("Cherry Tree");
            temp.add("Monolopy");
            temp.add("Truck");
            temp.add("Paddle Board");
            temp.add("Puzzle");
            temp.add("Skipping Rope");
            System.out.print(temp);	
        }
    }    
}
