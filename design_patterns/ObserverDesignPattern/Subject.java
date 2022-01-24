/**
 * Written by Heidi Duncan
 */
package ObserverDesignPattern;

/**
 * The Subject Interface connects the StudentGovPoll class to the Observer Interface where it sends
 * the data through the funcions of TallyDisplay and PercentageDisplay.
 */
public interface Subject {
    
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
