public class Abstractclassandmethod {
    public static void main(String args[])
    {
        carnivorous c=new cub();//upcasting
        c.tiger();
        c.lion();

    }
}
//abstract class may or may not have abstract methods
abstract class carnivorous{
    public void tiger()
    {
        System.out.println("Tiger is a carnivorous animal");
    }
    //abstract method should not have a method body
    abstract public void lion();

}
class cub extends carnivorous{
    @Override
    public void lion()
    {
        System.out.println("Lion is an carnivorous animal and it is the parent of cub");
    }





}


