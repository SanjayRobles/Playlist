/**
 * File for a Song class to be used in the Playlist Project
 * @author
 * @version
 */
public class Song {
    //Fields-- what information do we want each Song to store?
    private String name;
    private String author;
    private int sec;
    private int status;

    /**
     * Constructor-- what information needs to be given to make a Song?
     * How will you handle 'liked' songs? It makes sense for a Song not be 'liked' by default
     */
    public Song (String title,String artist, int seconds ){
        name = title;
        author = artist;
        sec = seconds;
        status = 0;
    }

    /**
     * Returns the length of the song in seconds
     * @return song length in seconds
     */
    public double getSecs()
    {
        return (sec);
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

    /**
     * Returns the like/dislike status of the song
     * @return the status of the song: 0=Neutral, 1=Liked, 2=Disliked
     */
    public int getStatus()
    {
        return status;
    }

    /**
     * Sets like/dislike status
     * @param newStat an integer 0-2: 0=Neutral, 1=Liked, 2=Disliked
     */
    public void setStatus(int newStat)
    {
        status=newStat;
    }

    public String toString()
    {
        return name+" by "+author+"\nPlaytime: "+sec+" seconds\nStatus: "+status;
    }
}
