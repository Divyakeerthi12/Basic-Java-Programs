public class Typecasting {
    public static void main(String args[])
    {
        //Implicit type conversion
        int radius =100;
        double newRadius=radius;
        System.out.println(newRadius);
        //Explicit type conversion
        //Some amount of data is lost during explicit type conversion. Here 0.75 is
        //lost when try to fit double into int.
        double diameter = 3.75;
        int newDiameter = (int)diameter;
        System.out.println(newDiameter);
        //Long takes on 19 digits
        long v= 5678998765678909887L;
        int d=(int)v;
        System.out.println(d);

    }
}

