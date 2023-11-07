//Play a little prank with your friends and
// swap their names in the attendance website.
// Use Java to code a program to perform this.
// Keep in mind that you do not have any additional space for more variables.
// Use just two.
//Example -
//Input: a = "Harry", b = "Drake"
//Output: a = "Drake", b = "Harry"
import java.util.*;
public class ProblemStatement8 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a name");
        String a=sc.next();
        String b=sc.next();
        System.out.println("a= "+a+" "+"b= "+b);
        a=a+b;
        b=a.substring(0,(a.length()-b.length()));
        a=a.substring(b.length());
        System.out.println("a= "+a+" "+"b= "+b);

    }
}

