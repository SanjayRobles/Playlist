import java.util.ArrayList;

/**
 * The Playlist class, which will keep track of a playlist of Song objects
 * Refer to the project description to make sure you have access to all available methods
 */
public class Playlist {
    /**
     * Fields-- This will likely just need to be the ArrayList of Songs. Reference our previous problems
     * (CarDealership, Zoo) for structure on how this will look
     */
    ArrayList<Song> Songs;



     /**
      * Constructor-- this doesn't need any parameters. You should just initialize the ArrayList and
      * then use additional methods to add Songs in one-by-one
      */
    public Playlist()
    {
        Songs=new ArrayList<Song>();
    }

      

      /**
       * Methods-- Remember that you need to be able to complete all of the following:
       * Adding a song
       * 'liking' a song
       * Removing a specific song
       * Examining all Songs (a String return or void print makes sense here)
       * Examining a sublist of all liked songs
       * Determining the total duration of all songs
       * Removing all unliked songs from the playlist (careful with this one!)
       */
    public void addSong(Song nSong)
    {
        Songs.add(nSong);
    }

    public void likeDislike(String songName,int newStat)
    {
        for(int i=0;i<Songs.size();i++)
        {
            Song s=Songs.get(i);
            if(s.getName().equals(songName))
            {
                s.setStatus(newStat);
            }
        }
    }

    public void removeSong(Song nSong)
    {
        Songs.remove(nSong);
    }

    public void removeUnliked()
    {
        for(int i=0;i<Songs.size();i++)
        {
            if(Songs.get(i).getStatus()==2)
            {
                Songs.remove(i);
                i--;
            }
        }
    }

    public String getLikedSongs()
    {
        String ret ="";
        for(int i=0;i<Songs.size();i++)
        {
            if(Songs.get(i).getStatus()==1)
            {
                ret=ret+Songs.get(i);
                ret=ret+"\n";
            }
        }
        return ret;
    }

    public int getTotalLen()
    {
        int ret=0;
        for(int i=0;i<Songs.size();i++)
        {
            ret+=Songs.get(i).getSecs();
        }
        return ret;
    }

    public ArrayList<Song> getSongs()
    {
        return Songs;
    }

    public String toString()
    {
        String ret = "";
        for(int i=0;i<Songs.size();i++)
        {
            ret=ret+Songs.get(i);
            ret=ret+"\n";
        }
        return ret;
    }
}
