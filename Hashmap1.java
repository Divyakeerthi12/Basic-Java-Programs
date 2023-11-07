import java.util.Map;
import java.util.HashMap;
public class Hashmap1 {
    public static void main(String args[])
    {
        Map<String,Integer> v=new HashMap();
        v.put("Apple",1);
        v.put("Banana",2);
        v.put("Pineapple",3);
        v.put("Green apple",4);
        v.put("Papaya",5);
        v.put("Strawberry",6);
        //Display all the elements through foreach syntax
        //Values are not ordered
        //Can store only object type data
        for(Map.Entry u:v.entrySet())
        {
            System.out.println(u);
        }



    }

}

