//Method overloading- same name but different parameters
public class MethodOverloading {
    public static void main(String args[])
    {
        add();
        add(1,6);
        float resultsum=add(4.6f,8.0f);
        System.out.println(resultsum);

    }
    public static void add()
    {
        int sum=3+4;
        System.out.println(sum);

    }
    public static void add(int a, int b)
    {
        int sum=a+b;
        System.out.println(sum);
    }
    public static float add(float a, float b)
    {
        float sum= a+b;
        return sum;
    }
}
