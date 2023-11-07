//Write a program to ask the user to input any number and when the user enters
//zero , then come out of the loop and print the sum of all the numbers entered using
// do while loop.
import java.util.Scanner;
public class do_while_loop {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double num;
        double sum=0;
        do {
            System.out.println("Enter the number");
            num=sc.nextDouble();
            sum=sum+num;

        }while(num!=0);
        System.out.println("The sum is "+sum);
        sc.close();
    }
}

