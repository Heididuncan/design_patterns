package StrategyDesignPattern;
import java.util.ArrayList;
public class Listing {

	private String title;
	private ArrayList<String> items;
	
	public Listing()
	{
		items = new ArrayList<String>();
		this.title = "";
	}
	public Listing(String string) {
		items = new ArrayList<String>();
		this.title = "";
	}
	public void add(String item)
	{
		items.add(item);
	}
	public void remove(String item)
	{
		items.remove(item);
	}
	public String getTitle()
	{
		return title;
	}
	//SortBehavior sortBehavior = new SortBehavior();
	public void setSortBehavior(SortBehavior sortBehavior)
	{
		//SortBehavior data = null; //= new SortBehavior();
		//data.getClass();
		//data.getClass((BubbleSort.class));
		//Listing data = (Listing) new 
		
			setSortBehavior((SortBehavior) items);
	
			//return;
			//InsertionSort(); 
	}
	public ArrayList<String> getSortedList()
	{
		return SortBehavior.sort(items);
	}
	public ArrayList<String> getUnsortedList()
	{
		return items;
	}
	//private static 
}