//Write a program to input a number and check if it is prime or not.
// Write the program using both for loop and while loop.
import java.util.*;
public class Primenumber {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        //Using while loop
        boolean flag=false;
        int a;
        System.out.println("Enter a number");
        a=sc.nextInt();
        int b=2;
        while(b<=a/2)
        {
            if(a%b==0)
            {
                flag=true;
                break;
            }
            b++;

        }
        if(flag)
        {
            System.out.println("Not a prime number");
        }
        else {
            System.out.println("Prime number");
        }
        //Code for prime number using for loop
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int i;
        boolean flag1=false;
        for(i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                flag1=true;
                break;
            }


        }
        if(flag1)
        {
            System.out.println("Not a prime number");
        }
        else{
            System.out.println("Prime number");
        }
    }
}

