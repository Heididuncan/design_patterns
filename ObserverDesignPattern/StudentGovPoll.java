/**
 * Written by Heidi Duncan
 */
package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.HashMap;

//The StudentGovPoll class that connects the subject interface with the information to the display classes
public class StudentGovPoll implements Subject {
    
    ArrayList<Observer> observers;
    HashMap<String, Integer> votes = new HashMap<String, Integer>();
    String school = "Fun Collegiate";
    int numUpdates;
    //private String president;
    String president;

    public StudentGovPoll(String school){
        votes = new HashMap<String, Integer>();
        observers = new ArrayList<Observer>();
        school = this.school;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
        
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        
    }

   @Override
    public void notifyObservers() {
        for(Observer observer : observers)
        {
            observer.update(votes);
        }
        
    }
    
    public void addCandidate(String president){
        //votes = new HashMap<String, Integer>();
        
            this.president = president;
            votes.keySet();
         
            notifyObservers();   
       
    }
    /** 
     * The enterVotes class takes in the vote number and matches the string for the 
     * candidate to the number of votes
    */
     public void enterVotes(String president, int num){
        
       votes.put(president, num);
        if(votes.keySet().contains(president))
          {
               votes.entrySet().hashCode();
              //votes.values()
          }
       
        notifyObservers();
        
    }

    public String getSchool(){
        return this.school;
    }
}
