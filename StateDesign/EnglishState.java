/**
 * @author Heidi Duncan
 */
package StateDesign;
import java.util.ArrayList;

public class EnglishState implements State {

    private MusicBox box;
    /**
     * @param box Instance of the music box in the English State
     *            the "buttons" can be controlled within the class 
     */
    public EnglishState(MusicBox box) {
        this.box = box;
    }
    /**
     * Adding Lyrics to a ArrayList 
     * Passing into the playSong method when the Star/Happy Button is in the english state
     */
    @Override
    public void pressStarButton() {
       ArrayList<String> starELyrics = new ArrayList<>();
       String songName = "Twinkle Twinkle Little Star";
       starELyrics.add("Twinkle Twinkle Little Star");
       starELyrics.add("How I wonder what you are");
       starELyrics.add("Up above the world so high");
       starELyrics.add("Like a dimond in the sky");
       starELyrics.add("Twinkle twinkle little star");
       starELyrics.add("How I wonder what you are");
       box.playSong(songName, starELyrics);
    }
    
    @Override
    public void pressHappyButton() {
        ArrayList<String> happyELyrics = new ArrayList<>();
        String songName = "If You're Happy and You Know It";
        happyELyrics.add("If you're happy and you know it clap your hands");
        happyELyrics.add("If you're happy and you know it clap you hands");
        happyELyrics.add("If you're happy and you know it");
        happyELyrics.add("And you really want to show it");
        happyELyrics.add("If you're happy and you know it clap you hands");
        box.playSong(songName, happyELyrics);
        
    }

    @Override
    public void pressEnglishButton() {
        System.out.println("You're already in English Mode");
        box.setState(box.getEnglishState());
    }

    @Override
    public void pressFrenchButton() {
        System.out.println("Switching to French Mode");
        box.setState(box.getFrenchState());
        
    }

    @Override
    public void pressSpanishButton() {
        System.out.println("Switching to Spanish Mode");
        box.setState(box.getSpanishState());
        
    }

}
