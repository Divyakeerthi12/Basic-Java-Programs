//Create an abstract class 'Animals1' with two abstract methods 'cats' and 'dogs'.
// Now create a class 'Cats' with a method 'cats' which prints "Cats meow" and a class 'Dogs' with a method 'dogs' which prints "Dogs bark", both inheriting the class 'Animals'.
// Now create an object for each of the subclasses and call their respective methods.
public class ProblemStatement14 {
    public static void main(String args[])
    {
        Cats c=new Cats();
        c.cats();
        Dogs d=new Dogs();
        d.dogs();

    }
}
abstract class Animals1{
    abstract public void cats();
    abstract public void dogs();


}
//If you inherit abstract class ,you should implement all its abstract methods
class Cats extends Animals1
{
    public void cats()
    {
        System.out.println("Cats meow");
    }
    public void dogs()
    {
        //code

    }
}
class Dogs extends Animals1 {
    public void cats()
    {
        //code
    }
    public void dogs()
    {
        System.out.println("Dogs Bark");
    }
}

