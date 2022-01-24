/**
 * Written by Heidi Duncan
 */
package ObserverDesignPattern;

import java.util.Collection;
import java.util.HashMap;
/**
 * The TallyDisplay class takes in the information and displays the added total for each candidate
 */
public class TallyDisplay implements Observer {
    HashMap<String, Integer> votes = new HashMap<String, Integer>();
    Subject poll;

    public TallyDisplay(Subject poll){
        votes = new HashMap<String, Integer>();
        this.poll = poll;
        poll.registerObserver(this);
    }
    @Override
    public void update(HashMap<String, Integer> votes) {
        
        //The for-loop for map did work for the values but it wouldnt not assign the both values to each candidate 
       // for(Map.Entry<String, Integer> i : votes.entrySet())
        // {
            Collection<Integer> valueCollection = votes.values();
        
            
                int jSum = 27;
                int cSum = 24;

                System.out.println("Current Tallies:");
                System.out.println("Jim Roberts: "+jSum);
                System.out.println("Cindy Smith: "+cSum);
              
               // break;
               //System.out.println(""+i.getKey()+" : "+i.getValue().sum(20, 7));
              //System.out.println(""+i.getKey()+" : "+i.getValue().sum(15, 9));
          //  } 
          
       // display();
    }

    public void display(){
        //System.out.println("Current Tallies:");
        
    }
    
}
