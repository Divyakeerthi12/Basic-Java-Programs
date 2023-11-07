public class HierarchialInheritance {
    public static void main(String args[])
    {
        Doggy d= new Doggy();
        d.name="Dalmation";
        d.color="Back and White";
        System.out.println("Name of the Dog is "+d.name);
        System.out.println("Color of "+ d.name +" is "+d.color);
        d.behaviour();
        d.sound();
        cat c= new cat();
        c.name="Ragdoll";
        c.color1="White";

        System.out.println("Name of the Cat is "+c.name);
        System.out.println("Color of "+c.name  +" is "+c.color1);
        c.behaviour();
        c.sound();

    }
}
class Animal{
    public String name;
    public void behaviour()
    {
        System.out.println("Animals can detect environmental stimuli like light,sound and touch");

    }

}
class cat extends Animal {
    String color1;

    public void sound()
    {
        System.out.println("Meow! Meow!");
    }
}
class Doggy extends Animal{
    String color;
    public void sound()
    {
        System.out.println("Bow!Bow!");
    }
}


