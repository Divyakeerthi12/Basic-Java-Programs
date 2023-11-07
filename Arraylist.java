import java.util.ArrayList;
import java.util.List;
public class Arraylist {
    public static void main(String args[])
    {
        List<String> names=new ArrayList();//upcasting
        //Integer is a Box Typed data.List does not take primitive datatype
        List<Integer> num=new ArrayList();
        List<Float>number=new ArrayList();
        //Adding the elements to the list
        names.add("Divya");
        names.add("Shravya");
        names.add("Bhavya");
        names.add("Kavya");
        //It can contain duplicate elements
        names.add("Shravya");
        num.add(4);
        num.add(5);
        num.add(6);
        num.add(7);
        number.add(3.45f);
        //To individually access the elements from the list
        System.out.println(names.get(0));//prints the element in the zeroth index
        System.out.println(num.get(0));
        System.out.println(number.get(0));
        //To access all the elements from the list
        //use for each syntax
        for(String name:names )
        {
            System.out.println(name);
        }
        for(int no:num)
        {
            System.out.println(no);
        }
    }
}
//List is an interface and ArrayList class implements List Interface

