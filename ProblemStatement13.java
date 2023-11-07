//Create an interface called perimeter with a method for calculating the perimeter.
// Now define this method in the Area class and use to calculate the perimeter of the Rectangle in the Main class.
import java.util.Scanner;

public class ProblemStatement13 {
    public static void main(String args[])
    {
        Area1 a =new Area1();
        a.perimeter();
    }
}
interface perimeter{
    public void perimeter();
}
class Area1 implements perimeter {
    Scanner sc = new Scanner(System.in);

    public void perimeter() {
        System.out.println("Enter the length and breadth");
        float length, breadth;
        length = sc.nextFloat();
        breadth = sc.nextFloat();
        System.out.println("The perimeter of the rectangle is " + 2*(length + breadth));

    }
}
