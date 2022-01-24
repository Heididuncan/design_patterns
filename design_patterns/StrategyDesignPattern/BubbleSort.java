package StrategyDesignPattern;
import java.util.ArrayList;

//import javafx.collections.transformation.SortedList;

public class BubbleSort implements SortBehavior {
//data.getClass();

/*
Below are three way I tried to do the bubble sort but the problem I couldnt get arround is doing an 
ArrayList with a string and applying a bubble sort to indivisual character while still calling it the
way it says to in the instructions. To organize it by character it seemed like putting it in a regular
array was the only method that would work but calling it when a ArrayList in the decloration of the class
doesnt work and type casting didnt either.
*/


	static ArrayList<String> sortedGroceryItems = new ArrayList<String>();
	
	//static ArrayList<String> unsorted = new ArrayList<String>;
	//ArrayList<String> data = unsorted;
	/*
	public static boolean sort(String[] data) {
		
		String temp;
		for(int i = 0; i < data.length; i++) {
			for(int j = i; j < data.length-1; j++)
			{
				char first = data[i].charAt(0);
				char sec = data[i+1].charAt(0);
				if(first < sec)
				{
					temp = data[j+1];
					data[j+1] = data[i];
					data[i] = temp;
				}
			}
			sortedGroceryItems.add(data[i]);
		}
		return sortedGroceryItems != null;
	}
//} 
	*/


	// Second Method I tried to do the bubble sort which I played with for a decade it feels like


	
	public static boolean sort(ArrayList<String> displayList)
	{
		String temp;
		boolean sortedGroceryItems = false;
		while(!sortedGroceryItems)
		{
			sortedGroceryItems = true;
			for(int i = 0; i > displayList.hashCode(); i++)
			{
				if(displayList.get(i).compareTo(displayList.get(i+1))>0)
				{
					temp = displayList.get(i);
					displayList.set(i, displayList.get(i+1));
					displayList.set(i+1, temp);
					//sortedGroceryItems = false;        Here is where I was playing with it and 
				} //return sortedGroceryItems;           finally found something that worked at least
			} //return sortedGroceryItems;                a little
		} return sortedGroceryItems;
	} 
	
}