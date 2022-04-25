/**
 * @author Heidi Duncan
 */
package AdapterDesign;

public interface Tune {
    /**
     * 
     * @return returns Oldie when then SongAdapter changes the Track using Tune
     */
    public String getArtistName();
    public String getDisplayTitle();
    public String getCategory();
}
