/**
 * File for a Song class to be used in the Playlist Project
 * @author
 * @version
 */
public class Song {
    //Fields-- what information do we want each Song to store?
    private String name = "This Must be the Place";
    private String author = "Talking yeads";
    private int min = 4;
    private int sec = 35;





    /**
     * Constructor-- what information needs to be given to make a Song?
     * How will you handle 'liked' songs? It makes sense for a Song not be 'liked' by default
     */
    public Song (String title,String artist, int minutes, int seconds ){
        String name = title;
        String author = artist;
        int min = minutes;
        int sec = seconds;
        boolean liked = false;




    }





     /**
      * Methods-- what will you want each Song to do?
      * Consider all the getter methods (getName, getArtist, etc.)
      * You should probably have a toString method to be able to get the information for the full
      * song easily as well!
      * What kind of mutator (setter) methods will you need?
      */

    /**
     * Returns the length of the song
     * @return song length in the form of (minutes.seconds)
     */
    public double getLength()
    {
        return 0;
    }

    /**
     * Returns the name of the song
     * @return song name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Returns the author of the song
     * @return song author
     */
    public String getAuthor()
    {
        return author;
    }
}
