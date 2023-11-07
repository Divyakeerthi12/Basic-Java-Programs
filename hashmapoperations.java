import java.util.Map;
import java.util.HashMap;
import java.util.logging.SocketHandler;

public class hashmapoperations {
    public static void main(String args[])
    {
        Map<String,Float> mp=new HashMap();
        mp.put("Shrika",5.7f);
        mp.put("Sathiya",6.0f);
        mp.put("Manasvi",5.0f);
        mp.put("Neraj",6.6f);
        //entrySet:It is used to return a collection view of the mappings contained in this map
        for(Map.Entry mk: mp.entrySet())
        {
            //Prints all the elements of the hashmap
            System.out.println(mk);
        }
        //Operations on hashmap
        //It is used to return true if this map contains
        // a mapping for the specified key
        System.out.println(mp.containsKey("Shrika"));
        //containsValue:It is used to return true
        // if this map maps one or more keys to the specified value
        System.out.println(mp.containsValue(5.7f));
        //clears all the values
        mp.clear();
        for(Map.Entry mk: mp.entrySet())
        {
            //Prints all the elements of the hashmap
            System.out.println(mk);
        }
        // It is used to return true if this map contains no key-value mappings
        System.out.println(mp.isEmpty());
        //keySet
        mp.put("Shrika",5.7f);
        mp.put("Sathiya",6.0f);
        mp.put("Manasvi",5.0f);
        mp.put("Neraj",6.6f);
        //keySet:prints all the keys from the hashmap

        System.out.println(mp.keySet());
        //size:It is used to return the number of key-value mappings in this map
        System.out.println(mp.size());



    }
}

