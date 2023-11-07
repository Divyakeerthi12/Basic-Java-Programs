//Write a program to print the odd numbers from 1 to 100
public class Forloop {
    public static void main(String args[])
    {
        int number=1;
        for(number=1;number<=100;number++)
        {
            if(number%2!=0)
            {
                System.out.println(number);
            }
        }

    }
}

