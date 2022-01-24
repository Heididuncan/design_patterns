/**
 * Written by Heidi Duncan
 */
package ObserverDesignPattern;
//import java.util.ArrayList;
import java.util.HashMap;

public interface Observer {
    
    public void update(HashMap<String, Integer> votes);
    
}
