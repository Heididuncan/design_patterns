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
	
	
	/*
	 Third Method and where I where got desprate and tried to make a new ArrayList and then tried
	 to compare the right list order with wrong one in order to make the right swap like insertion
	 sort.
	*/

	//public static void sort(ArrayList<String> sortedGroceryItems) {
	
	//ArrayList<String> a = "'Apples'\n'Bananas'\n'Cheese'\n'Cherries'\n'Chocolate'\n'Crackers'\n'Oranges'\n'Peaches'";
	//String temp;
	//String a = temp;
	//boolean displayList = false;
	//while(displayList)
	//{
		//displayList = false;
	
		//ArrayList<String> temp = new ArrayList<String>();
			
			



			//if(sortedGroceryItems.size() > 1)
			//{
				//System.out.println("Apples\nBananas\nCheese\nCherries\nChocolate\nCrackers\nOranges\nPeaches");
				/*
				temp = sortedGroceryItems;
				temp.add("Apples");
				
				temp.add("Bananas");
				
				temp.add("Cheese");
				temp.add("Cherries");
				temp.add("Chocolate");
				temp.add("Crackers");
				temp.add("Oranges");
				temp.add("Peaches");
				*/
				//sortedGroceryItems = sortedGroceryItems.add("Apples");
				//Bananas\nCheese\nCherries\nChocolate\nCrackers\nOranges\nPeaches";
				
				//displayList = "'Apples'\n'Bananas'\n'Cheese'\n'Cherries'\n'Chocolate'\n'Crackers'\n'Oranges'\n'Peaches'";;
				//break;
				//displayList = temp != null;
				//break;
				//displayList = true;
				//System.exit(0);
			//} 
			//System.out.print(temp);
			//System.exit(0);
			
			//for(sortedGroceryItems.contains("A"))
			//{
				/*
				if(sortedGroceryItems.get(i).compareToIgnoreCase(sortedGroceryItems.get(i+1))>0)
				{
					temp = sortedGroceryItems.get(i);
					sortedGroceryItems.set(i, sortedGroceryItems.get(i+1));
					sortedGroceryItems.set(i+1, temp);
					
					displayList = true;
					
				}
				*/
			//}
		//System.out.println("Apples\nBananas\nCheese\nCherries\nChocolate\nCrackers\nOranges\nPeaches");	
		//}
		
		//System.exit(0);
	
	//}
	//System.exit(0);
//System.out.println("Apples\n"Bananas"\n"Cheese"\n"Cherries"\n"Chocolate"\n"Crackers"\n"Oranges"\n"Peaches");

}