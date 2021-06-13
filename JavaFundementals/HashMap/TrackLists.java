import java.util.HashMap;
import java.util.Set;
public class TrackLists{
    public static void main(String[] args){
        HashMap<String, String> trackList = new HashMap<String, String>();
            trackList.put("song1", "lyrics1");
            trackList.put("song2", "lyrics2");
            trackList.put("song3", "lyrics3");
            trackList.put("song4", "lyrics4");
            String track = trackList.get("song1");
            Set<String> keys = trackList.keySet();
            for (String key : keys){
                System.out.println(trackList.get(key));
                System.out.println(key);
            }
            
    }
}