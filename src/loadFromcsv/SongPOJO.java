package loadFromcsv;

import java.util.Arrays;

public class SongPOJO {
    private String id;
    private String Name;
    private String Album;
    private String[] Artist;
    public void setId(String id) {
        this.id = id;
    }

    public void setArtist(String[] artist) {
        Artist = artist;
    }

    public void setName(String name) {
        Name = name;
    }

    
    public void setAlbum(String album) {
        Album = album;
    }

    @Override
    public String toString() {
        return "SongPOJO [id=" + id + ", Name=" + Name + ", Album=" + Album + ", Artist=" + Arrays.toString(Artist)
                + "]";
    }

}
