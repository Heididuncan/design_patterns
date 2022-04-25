/**
 * @author Heidi Duncan
 */
package AdapterDesign;

public class Track extends Song {
    private String title;
    private String album;
    private String firstName;
    private String lastName;
    private String genres;
    private Genre genre;
    //public ArrayList<Genre> genres;
    /**
     * 
     * @param title the variable for the title of the track
     * @param album the variable for the album of the track
     * @param firstName the variable for the firstName of the artist 
     * @param lastName the variable for the lastName of the artist
     * @param genre The variable for the genres emun
     */
    public Track(String title, String album, String firstName, String lastName, Genre genre){
        this.title = title;
        this.album = album;
        this.firstName = firstName;
        this.lastName = lastName;
        this.genre = genre;
        //genres = new ArrayList<>();
    }
    public Track(String title, String album, String firstName, String lastName, String genres){
        this.title = title;
        this.album = album;
        this.firstName = firstName;
        this.lastName = lastName;
        this.genres = genres;
        //genres = new ArrayList<>();
    }
    public String getTitle(){
        return title;
    }
    
    public String getAlbum(){
        return album;
    }
    
    public String getArtistFirstName(){
        return firstName;
    }
    
    public String getArtistLastName(){
        return lastName;
    }
    
    public String getGenre(){
        //String genress = genre.name().concat(genress);
       return genres;
    }
}
