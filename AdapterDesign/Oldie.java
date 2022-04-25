/**
 * @author Heidi Duncan
 */
package AdapterDesign;

public class Oldie implements Tune {

    private String airtistName;
    private String songTitle;
    private String recordTitle;
    private String category;
    /**
     * 
     * @param artistName The airstName for the track
     * @param songTitle  The soundTitle for the track
     * @param recordTitle The recordTitle for the track
     * @param category    The category gets switched with genre. I think this is where
     *                    the Song class would get confused
     */
    public Oldie(String artistName, String songTitle, String recordTitle, String category){
        this.airtistName = artistName;
        this.songTitle = songTitle;
        this.recordTitle = recordTitle;
        this.category = category;
    }
    
    public String getArtistName() {
        return airtistName;
    }

    
    public String getDisplayTitle() {
        return recordTitle;
    }

    
    public String getCategory() {
        return category;
    }
    
}
