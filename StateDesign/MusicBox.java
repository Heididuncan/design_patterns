/**
 * @author Heidi Duncan
 */
package StateDesign;

import java.util.ArrayList;
import java.lang.Thread;
/**
 * The MusicBox controlls the state and initiates the changes or flips within the interface
 * that call to each of the state(language) classes
 */
public class MusicBox {
    private State englishState;
    private State frenchState;
    private State spanishState;
    private State state;

    /**
     * @param englishState is set to the default to avoid any null exception errors
     */
    public MusicBox(){
        englishState = new EnglishState(this);
        frenchState = new FrenchState(this);
        spanishState = new SpanishState(this);
        while(state == null){
            state = englishState;
            break;
        }    
    }
    //Setting each state so it "flips" or changes correctly to the approproate language desired
    public void pressStarButton(){
        state.pressStarButton();
    }
    public void pressHappyButton(){
        state.pressHappyButton();
    }
    public void pressEnglishButton() {
        state.pressEnglishButton();
    }
    public void pressFrenchButton() {
        state.pressFrenchButton();
    }
    public void pressSpanishButton() {
        state.pressSpanishButton();
    }
    public void setState(State state){
        this.state = state;
    }
    public State getEnglishState(){
        return englishState;
    }
    public State getFrenchState(){
        return frenchState;
    }
    public State getSpanishState(){
        return spanishState;
    }
    /**
     * 
     * @param songName Passing in name of the song from the state classes in the format desired
     * @param lyrics   lyrics within the each arraylist that are called and a for loop to 
     *                 convert into a string and then each string in the ArrayList goes through
     *                 the loop and a sleep timer slowly display lyrics to console
     */
    public void playSong(String songName, ArrayList<String> lyrics){
       System.out.println("\n"+"Playing: "+songName);
        try {
            for(String sLyrics: lyrics){
                Thread.sleep(1000);
                System.out.println(sLyrics);
            } 
            }catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(""); 
    }
}   
