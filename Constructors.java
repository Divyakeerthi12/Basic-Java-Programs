import java.util.*;
public class Constructors {
    public static void main(String args[])
    {
        Dog dg=new Dog();//Calling default constructor


        Dog dg1=new Dog("Dalmation",50,"Blackandwhite");//parameterized constructor

    }
}
class Dog{
    public Dog()//default constructor
    {
        System.out.println("Default constructor is called");
    }
    public Dog(String breed,int size, String color)
    {
        System.out.println("Parameterized constructor is called");
        System.out.println(breed+"\n"+size+"\n"+color+"\n");
    }

}

