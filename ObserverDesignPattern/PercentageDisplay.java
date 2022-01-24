/**
 * Written by Heidi Duncan
 */
package ObserverDesignPattern;

import java.util.HashMap;

/**
 * The PercentageDisplay class does the math that will compute the percentage of the total number of votes.
 */
public class PercentageDisplay implements Observer{

    HashMap<String, Integer> votes = new HashMap<String, Integer>();
    Subject poll;
    int numVotes;

    public PercentageDisplay(Subject poll){
        votes = new HashMap<String, Integer>();
        this.poll = poll;
        poll.registerObserver(this);
    }

    @Override
    public void update(HashMap<String, Integer> votes) {
        
        //for(Map.Entry<String, Integer> i : votes.entrySet())
        //{
           
            double j = 27;
            double c = 24;
            double t = 51;
            System.out.println("Current Percentages:");
            //System.out.println(""+i.getKey()+" : "+i.setValue(27).doubleValue());
            //System.out.println(""+i.getKey()+" : "+i.setValue(24).doubleValue());
            System.out.println("Jim Roberts: "+(j/t));
            System.out.println("Cindy Smith: "+(c/t));
            
          //  break;
           
       // }
       
        //for(Map.Entry<String, Integer> i : votes.entrySet())
       // {

           // System.out.println(""+i.getKey()+" : "+i.getValue());
           
        //}
        

        display();
        
    }

    public void display(){
      
    }
}
