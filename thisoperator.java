public class thisoperator {
    public static void main(String args[])
    {
        String color;
        String brand;
        color="Blue";
        brand="Zivami";
        Dress d= new Dress(color,brand);

    }
}
class Dress
{
    String color;
    String brand;
    public Dress(String color,String brand)
    {

        this.color=color;
        this.brand=brand;
        System.out.println(color+"\n"+brand);
    }
}
