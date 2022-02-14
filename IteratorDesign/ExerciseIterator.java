/**
 * Written by Heidi Duncan
 */
package IteratorDesign;
/**
 * The ExerciseIterator class implements the interface Iterator which then will go through
 * the list of information and make the array with the information so it can be efficently 
 * sort through in the Exercise class. This class keeps track of the size of the array so the 
 * program knows when the end of the list is reached. It can take care of removing
 * or adding target muscle because of the functioning for readjusting the size as well.
 */
public class ExerciseIterator implements Iterator{

    private Exercise[] exercises;
    private int position = 0;

    public ExerciseIterator(Exercise[] exercises)
    {
        this.exercises = exercises;
    }
    public boolean hasNext() {
        
        if(position >= exercises.length || exercises[position] == null) {
			return false;
		} else {
			return true;
		}
    }

    
    public Exercise next() {
        Exercise exercise = exercises[position];
		position = position + 1;
		return exercise;
    }

}
