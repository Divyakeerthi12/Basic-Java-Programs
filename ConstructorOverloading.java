public class ConstructorOverloading {
    public static void main(String args[])
    {
        float radius=2;
        double pi=3.14;
        //Constructor overloading
        Circle c = new Circle();
        Circle c1 = new Circle(radius);
        Circle c2 = new Circle(5, pi);



    }
}
class Circle{
    public Circle()
    {
        System.out.println("Default constructor is called");
    }
    public  Circle(float radius)
    {
        double circum= 2*(3.14)*radius;
        System.out.println("The circumference is "+circum);
    }

    public  Circle(float radius, double pi) {
        double circum=2*pi*radius;
        System.out.println("The circumference is "+circum);
    }



}
