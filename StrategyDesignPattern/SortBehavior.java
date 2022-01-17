package StrategyDesignPattern;
import java.util.ArrayList;
import java.util.List;
public interface SortBehavior {

	ArrayList<String> data = new ArrayList<String>();
	
	public static ArrayList<String> sort(ArrayList<String> data) {
		// TODO Auto-generated method stub
		//if(data != null)
		//data.toArray();
		BubbleSort.sort(data);
		InsertionSort.sort(data);
		//sort(BubbleSort.shoppingList);
		return data;
	}

	

	
}
/*
public static void BubbleSort(ArrayList<String> data) {
		
	public ArrayList<String> list = new ArrayList<String>();
	
	public ArrayList<String> BubbleSort(String[] data) {
		
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
			list.add(data[i]);
		}
		return list;
	}
} */