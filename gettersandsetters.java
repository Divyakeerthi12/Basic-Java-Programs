import java.util.*;
public class gettersandsetters {
    public static void main(String args[])
    {

        String breed;
        String color;
        float size;
        breed="Dalmation";
        color="Black and White";
        size= 30;

        Animaldog d= new Animaldog();
        d.setBreed(breed);
        d.setColor(color);
        d.setSize(size);
        System.out.println(d.getBreed());
        System.out.println(d.getColor());

        System.out.println(d.getSize());




    }
}
