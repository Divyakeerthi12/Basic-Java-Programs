public class RuntimePolymorphism {
    public static void main(String args[])
    {
        Flamingo fg=new Flamingo();
        fg.Fly();
        swan s=new swan();
        s.Fly();

    }
}
class Bird{
    public void Fly()
    {
        System.out.println("Birds can fly");
    }

}
//Method overriding
//Happens during run time
class Flamingo extends Bird
{
    public void Fly()
    {
        System.out.println("Flamingo can fly and it is a beautiful bird");
    }

}
//Display both parent method function and child function using super keyword
class swan extends Bird
{

    public void Fly()
    {
        super.Fly();
        System.out.println("Swan can fly");
    }
}
