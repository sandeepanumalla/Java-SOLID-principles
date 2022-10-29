package loadFromcsv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Loader {
    public static void main(String[] args) {
        List<SongPOJO> list = new ArrayList<>();
        try{
            FileReader file = new FileReader("src\\loadFromcsv\\songs.csv");
            String line = "";
            BufferedReader br = null;
            br = new BufferedReader(file);
            while((line = br.readLine()) != null){
                SongPOJO song = new SongPOJO();
                String[] row = line.split(",");
                    song.setId(row[0]);
                    song.setName(row[1]);
                    song.setAlbum(row[2]);
                    String[] arr = row[5].split("#");
                    song.setArtist(arr);
                list.add(song);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        list.stream().forEach(System.out::println);
    }
}
