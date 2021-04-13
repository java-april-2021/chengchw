import java.util.HashMap;
import java.util.Set;

public class HashMapClass{

    public static void main(String[] args){

        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("JayCho","Old Style");
        trackList.put("EasonChen","Lick China");
        trackList.put("PigShow","Fuck Air");
        trackList.put("JJ","little JJ");

        Set<String> keys = trackList.keySet();
        for (String key: keys){

            System.out.println(key);
            System.out.println(trackList.get(key));
        }

        System.out.println(trackList.keySet());


    }
}
