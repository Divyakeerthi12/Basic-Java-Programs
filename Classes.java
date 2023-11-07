
//Within the class Rectangle, define:
//
//Two field variables of length and breadth
//Methods to calculate the area and the perimeter of the Rectangle
import java.util.*;

public class Classes {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the Rectangle");
        float length=sc.nextFloat();
        System.out.println("Enter the breadth of the Rectangle");
        float breadth=sc.nextFloat();
        Rectangle rect =new Rectangle();
        rect.length=length;
        rect.breadth=breadth;
        System.out.println("Area of the Rectangle "+rect.getArea());
        System.out.println("Perimeter of the Rectangle "+rect.getperimeter());

    }
}



