//Calculate the area of different figures like rectangle, square, circle.
// Input the operands by the user for side length or radius.
// For performing the same create a different class Area
// and make the methods for the different figures.
// Then in the Main class, use the Area class to perform these operations.
//Example -
//Input: Radius = 3
//Output: 28.26
import java.util.*;
public class ProblemStatement12 {
    public static void main(String args[])
    {
        Area a = new Area();
        a.rectangle();
        a.square();
        a.circle();

    }
}
class Area{
    Scanner sc=new Scanner(System.in);
    public void rectangle()
    {
        System.out.println("Enter the length and breadth");
        float length,breadth;
        length=sc.nextFloat();
        breadth=sc.nextFloat();
        System.out.println("The area of the rectangle is "+(length*breadth));



    }
    public void square()
    {
        System.out.println("Enter the sides of the square");
        float side;
        side=sc.nextFloat();
        System.out.println("The area of the square is "+(side*side));

    }
    public void circle()
    {
        System.out.println("Enter the radius of the circle");
        float radius;
        radius=sc.nextFloat();
        System.out.println("The area of the circle is "+(3.14*radius*radius));

    }


}

