import java.util.*;
import java.io.PrintStream;
public class Rectangle {
    public float length;//Instance Variable-declared inside class and outside method
    public float breadth;//Instance Variable
    public float getArea()
    {
        float Area= length*breadth;//local variable

        return Area;
    }
    public float getperimeter()
    {
        float perimeter=2*(length+breadth);//local variable


        return perimeter;
    }
}

