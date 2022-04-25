/**
 * @author Heidi Duncan
 */
package AdapterDesign;

public class SongAdapter extends Song {

    private Tune tune;
    /**
     * 
     * @param tune is the interface what is implemented in Oldie so wheneer tune. somthing
     *         is called it returns the method found inside of tune which returns the methods of 
     *         Oldie
     */
    public SongAdapter(Tune tune) {
        this.tune = tune;
    }
    public String getTile(){
        return tune.getDisplayTitle();
    }
    public String getAlbum(){
        return tune.getDisplayTitle();
    }
    public String getArtistFirstName(){
        return tune.getArtistName();
    }
    public String getArtistLastName(){
        return "";
    }
    public String getGenre(){
        return tune.getCategory();
    }
}
