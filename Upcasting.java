public class Upcasting {
    public static void main(String args[])
    {

        Insect i = new Grasshoper();//upcasting
        i.behaviour();
        Insect i2=new Insect();//Normal way
        i2.behaviour();


    }
}
class Insect{
    public void behaviour()
    {
        System.out.println("It covers a wide range of activities, such as feeding, locomotion, grooming, reproduction, learning, migration, and communication.");

    }
}
class Grasshoper extends Insect{
    public void behaviour()
    {
        System.out.println("Grasshoper is green in color");
    }
}
