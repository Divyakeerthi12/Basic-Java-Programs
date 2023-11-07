//You work in pairs in the computer lab.
// Play a prank with your partner and swap the marks entered for him with yours.
// Remember, you can only use 2 variables, else you'll get caught.
//Example -
//Input: a = 24, b = 43
//Output: a = 43, = 24
import java.util.*;
public class Problemstatement2 {
    public static void main(String args[])
    {
        int a;
        int b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for a and b");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Before swapping a= "+a+ " and b= "+b);
        a=a-b;
        b=a+b;
        a=b-a;
        System.out.println("After swapping a= "+a+ " and b= "+b);

    }
}

