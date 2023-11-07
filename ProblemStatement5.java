//Accept a three digit number from the user (100 to 999).
// First, check that the number has only three digits.
// Then separate each digit of the number and then arrange them in the reverse order
// such that the middle digit remains the same and first and third digit are swapped.
//Example -
//Input: 347
//Output: 743
import java.util.*;
public class ProblemStatement5 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int threedigitnumber;
        System.out.println("Enter the three digit number");
        threedigitnumber=sc.nextInt();
        int num=threedigitnumber;
        int count=0;
        //Checking whether the number has three digit or not
        while(num!=0)
        {
            num=num/10;
            count+=1;

        }
        System.out.println("The number count is "+count);
        if(count>3)
        {
            System.exit(0);
        }

        //Reverse the three digit number
        int num1=threedigitnumber;
        int rev=0;
        while(num1!=0)
        {
            int rem=num1%10;
            rev=rev*10+rem;
            num1=num1/10;
        }
        System.out.println("The reversed number is "+rev);
        sc.close();

    }
}

