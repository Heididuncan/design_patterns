/**
 * @author Heidi Duncan
 */
package AdapterDesign;

public abstract class Song {
    /**
     * 
     * @return returns the song with the toString that formats the outputs called from both
     *         Track and SongAdapter
     */
    public String getTitle(){
        return this.getTitle();
    }
    public String getAlbum(){
        return this.getAlbum();
    }
    public String getArtistFirstName(){
        return this.getArtistFirstName();
    }
    public String getArtistLastName(){
        return this.getArtistLastName();
    }
    public String getGenre(){
        return this.getGenre();
    }
    public String toString(){
        return "Album: "+getAlbum()+"\n"+"By: "+getArtistFirstName()+" "+getArtistLastName()+"\n"+"Genre: "+getGenre();
    }

}
