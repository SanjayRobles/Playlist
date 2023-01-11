/**
 * File for a Song class to be used in the Playlist Project
 * @author
 * @version
 */
public class Song {
    //Fields-- what information do we want each Song to store?
    private String name;
    private String author;
    private int min;
    private int sec;
    private boolean liked;
    private boolean disliked;

    /**
     * Constructor-- what information needs to be given to make a Song?
     * How will you handle 'liked' songs? It makes sense for a Song not be 'liked' by default
     */
    public Song (String title,String artist, int minutes, int seconds ){
        name = title;
        author = artist;
        min = minutes;
        sec = seconds;
        liked = false;
        disliked = false;
    }

    /**
     * Returns the length of the song in seconds
     * @return song length in seconds
     */
    public double getMins()
    {
        return (min*60+sec);
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
