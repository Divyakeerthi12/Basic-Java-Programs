public class Factorial {
    public static void main(String args[])
    {
        int number=6;
        long fact=1;
        while(number>0)
        {
            fact=fact*number;
            number--;
        }
        System.out.println(fact);

    }
}

