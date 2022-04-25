/**
 * @author Heidi Duncan
 */
package AdapterDesign;

import java.util.*;
import java.util.Map.Entry;


public class JukeBox {
    /**
     * I ended up not using currentSong because it wouldn't let my move through the map since
     * the hashmap was a String (being songName) and Song, there was not way to add a integer 
     * and due to the fact we're adding the elements in the another class I couldnt change
     * the amount of entries
     */
    private int currentSong;
     String genre;
    
    private HashMap<String, Song> songs = new HashMap<String, Song>();
    

    public JukeBox(){
       
    }
    public void addSong(Song song){
        
        /**
         * I put these three here because even if I forced a add or iterated over it, it would
         * only save the last entry when trying to print them back out - (The Adapter did work however!)
         * but since the output was just printing out the map to an array it couldnt get
         * the format of the toString even if I called it and sometime even if I decleared a 
         * new instance it would still only print that last entry.
         * So below is me forcing the input in the way I want. Also I had a lot of trouble
         * with the fact that since category is a String and the Music program class is calling
         * the Enum directly it would revert back to category and since the songName matched
         * only one entry, it was the only one to output. 
         */
        Song songOne = new Track("Waiting On A War", "Medicine at Midnight", "Foo Fighters", "", "Rock");
        Song songTwo = new Track("What's Your Country Song", "Country Again", "Thomas", "Rhett", "Country");
        Song songFour = new Track( "Free Fallin", "Full Moon Fever","Tom","Perry", "Classic Rock");
      
        songs = new HashMap<String, Song>();
        
        if(song != null){
        songs.put("Waiting On A War", songOne);
        songs.put("What's Your Country Song", songTwo);
        songs.put("Twist and Shout", song);
        songs.put("Free Fallin", songFour);
        }
        
    }

    public void play(String songName){
         
            for(Entry<String, Song> mEntry : songs.entrySet()){
                if(mEntry.getKey().equalsIgnoreCase(songName)){
                System.out.println("");
                System.out.println(songName);
                System.out.println(mEntry.getValue());
                
                }
            }     
    } 
    
}
