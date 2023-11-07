public class SingleInheritance {
    public static void main(String args[])
    {
        Crow cr= new Crow();
        cr.color="Black";
        System.out.println("The color of crow is "+cr.color);
        cr.behaviour();
        cr.sound();

    }
}
class Birds{
    public String color;
    public void behaviour() {
        System.out.println("Birds have down feathers that provide insulation");
    }
}
class Crow extends Birds{
    public void sound(){
        System.out.println("Crow makes CAA CAA sound");
    }

}

