import java.util.List;
import java.util.ArrayList;
public class ArrayListoperations {
    public static void main(String args[])
    {
        List<String> l1=new ArrayList();
        //used to insert the specified element at the specified position index in a list
        l1.add(0,"Cat");
        l1.add(1,"Wolf");
        l1.add(2,"Donkey");
        //prints all
        for(String s:l1)
        {
            System.out.println(s);
        }
        //Removes the element at the specified position in the list
        l1.remove(2);
        for(String s:l1)
        {
            System.out.println(s);
        }

        //Returns the size of the list
        System.out.println(l1.size());
        //It is used to remove all of the elements from this list
        l1.clear();
        for(String s:l1)
        {
            System.out.println(s);
        }
        //It is used to return the index in this list of the last occurrence of the specified
        // element,
        // or -1 if the list does not contain this elemen
        System.out.println(l1.lastIndexOf(0));
        //It is used to append the specified element to the end of a list
        l1.add("Dog");
        l1.add("Fox");
        l1.add("Deer");
        // It is used to return the index in this list of the
        // first occurrence of the specified element,
        // or -1 if the List does not contain this element
        System.out.println(l1.indexOf("Dog"));



    }
}

