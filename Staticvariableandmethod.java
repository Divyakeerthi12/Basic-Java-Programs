public class Staticvariableandmethod {
    public static void main(String[] args)
    {
        Employee e = new Employee();
        //static variables are accessed through class not through objects
        Employee.name="Dhanu";
        e.salary=10000;
        //Static methods are accessed through class names
        Employee.age();

    }
}
class Employee{
    //Static variable
    public static String name;
    //Non-static variable
    public  float salary;
    public static void age()
    {
        //static methods can access on static variables.It cannot access non-static variables


        //salary=10000;Not possible since salary is a non static variable
        System.out.println("The age of "+name+ " is 29");
    }
}
