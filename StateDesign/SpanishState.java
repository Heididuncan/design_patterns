/**
 * @author Heidi Duncan
 */
package StateDesign;

import java.util.ArrayList;

public class SpanishState implements State {
    private MusicBox box;
    /**
     * @param box Instance of the music box in the Spanish State
     *            the "buttons" can be controlled within the class 
     */
    public SpanishState(MusicBox box) {
        this.box = box;
    }
    /**
     * Adding Lyrics to a ArrayList 
     * Passing into the playSong method when the Star/Happy Button is in the english state
     */
    @Override
    public void pressStarButton() {
        ArrayList<String> starSLyrics = new ArrayList<>();
        String songName = "Estrellita, ¿Dónde Estás?";
        starSLyrics.add("Estrellita, ¿dónde estás?");
        starSLyrics.add("Quiero verte cintilar");
        starSLyrics.add("En el cielo, sobre el mar.");
        starSLyrics.add("Un diamante de verdad.");
        starSLyrics.add("Estrellita, ¿dónde estás?");
        starSLyrics.add("Quiero verte cintilar.");
        box.playSong(songName, starSLyrics);
    }

    @Override
    public void pressHappyButton() {
        ArrayList<String> happySLyrics = new ArrayList<>();
        String songName = "Si usted esta feliz";
        happySLyrics.add("Si usted esta feliz Apaluda las fuerte.");
        happySLyrics.add("Si usted esta feliz Apaluda las fuerte.");
        happySLyrics.add("Si usted esta feliz");
        happySLyrics.add("En su cara se vera.");
        happySLyrics.add("Si usted esta feliz Apaluda las fuerte.");
        box.playSong(songName, happySLyrics);
    }

    @Override
    public void pressEnglishButton() {
        System.out.println("Switching to English"); 
        box.setState(box.getEnglishState());
        
    }

    @Override
    public void pressFrenchButton() {
        System.out.println("Switching to French");
        box.setState(box.getFrenchState());
    }

    @Override
    public void pressSpanishButton() {
        System.out.println("Ya estás en modo español");
        System.out.print("  (You are already in Spanish Mode");
        box.setState(box.getSpanishState());
    }

}
