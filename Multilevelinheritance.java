import java.io.*;
public class Multilevelinheritance {
    public static void main(String args[])
    {
        calf cf=new calf();
        cf.name="Berrenda";
        System.out.println("Breed= "+cf.name);
        cf.sound();

    }
}
class Animals {
    String name;

    public void behaviour() {


        System.out.println("Animals can detect environmental stimuli like light,sound and touch");
    }
}
class Cow extends Animals{
    String breed;

    public void sound()
    {
        System.out.println("Baa! Baa!");
    }
}
class calf extends Cow{
    String name;

    public void sound()
    {
        System.out.println("Amba! Amba!");
    }
}

