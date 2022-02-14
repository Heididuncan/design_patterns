/**
 * Written by Heidi Duncan
 */
package IteratorDesign;
/**
 * The PT class taken in the information given first in the program, the name and bio of 
 * the person trying to workout. That is passed through so whatever name that is in the drive 
 * will apppear. It also displays the information as its shown in the example output.
 * One thing I was a little confused on and what is shows in the output is that "Exersices: "
 * is at the bottom but no matter how hard I tried or what I put in the toString method
 * I couldnt seem to get it to go to the top of the output, the driver has it below were it
 * displays the list, I dont know if that has anything to do with it but I couldnt seem to 
 * solve that one.
 */
import java.util.ArrayList;
public class PT {

    public String firstName;
	public String lastName;
    public String bio;
    int numExercises = 0;
    Exercise[] exercises;

    public PT(String firstName, String lastName, String bio) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bio = bio;

        System.out.println(" "+this.firstName+" "+this.lastName);
        System.out.println(" "+bio); 
        System.out.println(" ");
        System.out.println(" Exercises: ");
        System.out.println(" ");
        //Exercise.toString();
    }
      
    public void addExercise(String title, ArrayList<String> muscleGroups, ArrayList<String> directions)
    {
        //System.out.println(" "+this.firstName+" "+this.lastName);
        //System.out.println(" "+bio);
        
       
        exercises = new Exercise[numExercises];
        Exercise exercises = new Exercise(title,muscleGroups,directions);
        
      
    }
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public String getBio()
    {
        return bio;
    }
    
    public Exercise[] growArray(Exercise[] exercises)
    {
        exercises = new Exercise[numExercises];
        //Exercise exercises = new Exercise(title,muscleGroups,direction);
        
        if(numExercises > 0)
        {
            System.out.println("Something went wrong");
        } else {
            exercises[numExercises] = this.exercises[numExercises];
            numExercises = numExercises+1;
        } return exercises;
    }
    public ExerciseIterator createIterator()
    {
        return new ExerciseIterator(exercises);
    }
   
    public String toString()
    {
      
        return ""; 
      
    }
   
}
