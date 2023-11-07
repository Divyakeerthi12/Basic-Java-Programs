//Write a program to take the user input and calculate the simple
// interest using methods

import java.util.*;
public class Methods {
    public static void main(String args[])
    {
        int principal,time;
        float rate;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Principal");
        principal=sc.nextInt();
        System.out.println("Enter the rate of interest");
        rate=sc.nextFloat();
        System.out.println("Enter the time");
        time=sc.nextInt();
        double SimpleInterest=CalculateSimpleInterest(principal,rate,time);
        System.out.println(SimpleInterest);


    }
    public static double CalculateSimpleInterest(int principal,float rate, int time)
    {

        double SimpleInterest=principal*rate*time/100;
        return SimpleInterest;

    }
}

