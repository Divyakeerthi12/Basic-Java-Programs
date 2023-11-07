public class Strings {
    public static void main(String args[])
    {
        //Create a string object using literals
        String name="Ananya";
        //Create a string object using new keyword
        String a= new String("Ananya");
        //Compare two strings
        System.out.println(name==a);//compares two objects therefore it is false
        System.out.println(name.equals(a));//compares the values in the object therefore it is true

        String b="Vanijya";
        System.out.println(b);
        //String operations
        System.out.println(b.charAt(2));//prints the character at index 2
        System.out.println(b.toUpperCase());//prints all the characters to uppercase
        System.out.println(b.toLowerCase());//prints all the characters to lowercase
        System.out.println(b.contains("ijya"));
        System.out.println("Vanijya"=="VANIJYA");//String is case sensitive

        String c="Divya";
        String d="DIVYA";
        System.out.println(c.equalsIgnoreCase(d));//It ignores case sensitive
        String str="";
        System.out.println(str.isEmpty());
        //To get the index of a particular character present in a String use
        System.out.println(c.indexOf('v'));
        String v="    Tanuja";
        System.out.println(v);
        //There is a blank space at the beginning, we can remove it
        System.out.println(v.trim());






    }
}

