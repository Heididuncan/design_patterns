/**
 * @author Heidi Duncan
 */
package StateDesign;

import java.util.ArrayList;

public class FrenchState implements State {
    private MusicBox box;
    /**
     * @param box Instance of the music box in the French State
     *            the "buttons" can be controlled within the class 
     */
    public FrenchState(MusicBox box) {
        this.box = box;
    }
    /**
     * Adding Lyrics to a ArrayList 
     * Passing into the playSong method when the Star/Happy Button is in the english state
     */
    @Override
    public void pressStarButton() {
        ArrayList<String> starFLyrics = new ArrayList<>();
        String songName = "Brille, brille, petite étoile";
        starFLyrics.add("Brille, brille, petite étoile");
        starFLyrics.add("Je me demande vraiment ce que tu es!");
        starFLyrics.add("Au-dessus du monde si haut");
        starFLyrics.add("Comme un diamant dans le ciel");
        starFLyrics.add("Brille, brille, petite étoile");
        starFLyrics.add("Je me demande vraiment ce que tu es");
        box.playSong(songName, starFLyrics);
        
    }

    @Override
    public void pressHappyButton() {
        ArrayList<String> happyFLyrics = new ArrayList<>();
        String songName = "Si Tu as D' la Joie au Coeur";
        happyFLyrics.add("Si tu as d' la joie au coeur, Frappe des mains");
        happyFLyrics.add("Si tu as d' la joie au coeur, Frappe des mains");
        happyFLyrics.add("Si tu as d' la joie au coeur");
        happyFLyrics.add("Si tu as d' la joie au coeur");
        happyFLyrics.add("Si tu as d' la joie au coeur, Frappe des mains");
        box.playSong(songName, happyFLyrics);
    }

    @Override
    public void pressEnglishButton() {
        System.out.println("Switching to English"); 
        box.setState(box.getEnglishState()); 
    }

    @Override
    public void pressFrenchButton() {
        System.out.println("Vous êtes déjà en mode français");
        System.out.print("   (You are already in French Mode");
        box.setState(box.getFrenchState());
    }

    @Override
    public void pressSpanishButton() {
        System.out.println("Switching to Spanish");
        box.setState(box.getSpanishState());
    }

}
