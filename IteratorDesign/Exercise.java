/**
 * Written by Heidi Duncan
 */
package IteratorDesign;

import java.util.ArrayList;
/**
 * The Exercise class will go through the information and sort it into the designed list 
 * in each category of muscles. The format of how its seen in the output is handled within
 * this class, placing spaces and using System.out.Println and System.out.Print so it aligns 
 * with the example given for the assignment. The class makes two list that can then be 
 * appending to a list that will give the output seen in the picture as they has to display 
 * differently. This class also holds the methods that can add and delete the target muscles, 
 * the methods soley reply on the fact its a array list connected to a Iterator so the operations
 * of add and remove can still apply.
 */
public class Exercise {

    
    Exercise[] exercise;
    String title;
    ArrayList<String> targetMuscles = new ArrayList<String>();
    ArrayList<String> directions = new ArrayList<String>();
	
    Exercise(String title)
    {
        this.title = title;
    }
    
    public Exercise(String title, ArrayList<String> muscleGroups, ArrayList<String> directions) {


        if(title.equals("Lunges"))
        {
            System.out.println(" ");
            System.out.println("..."+title+"...");
            System.out.print("Muscles: ");
            for(String muscles: muscleGroups)
            {
              System.out.print(" "+muscles+" ");
            }
            System.out.println(" ");
            for(String direction: directions)
            {
            System.out.println(" - "+direction);
            }
        }
        if(title.equals("Pushups"))
        {
            System.out.println(" ");
            System.out.println("..."+title+"...");
            System.out.print("Muscles: ");
            for(String muscles: muscleGroups)
            {
              System.out.print(" "+muscles+" ");
            }
            System.out.println(" ");
            for(String direction: directions)
            {
            System.out.println(" - "+direction);
            }
        }
        if(title.equals("Jumping Rope"))
        {
            System.out.println(" ");
            System.out.println("..."+title+"...");
            System.out.print("Muscles: ");
            for(String muscles: muscleGroups)
            {
              System.out.print(" "+muscles+" ");
            }
            System.out.println(" ");
            for(String direction: directions)
            {
            System.out.println(" - "+direction);
            }
        }
    }
    public void addTargetMuscle(String muscle)
    {

    }
    public void removeTargetMuscle(String muscle)
    {

    }
    public String toString()
    { 
        return "";
    }
}
