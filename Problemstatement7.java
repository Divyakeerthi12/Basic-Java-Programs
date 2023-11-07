//Accept an array from a user, duplicate it by creating a similar array and
// then try to compare it by equating both arrays (using the == operator).
// The result will be false as the duplicate arrays won't be equal to each other.
// Try to find the reason behind it and also make the same by using a different function
// (you might need the help of the internet for this).
import java.util.*;
public class Problemstatement7 {
    public static void main(String args[])
    {
        int flag=0;
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements in an array");
        n=sc.nextInt();
        int[] b=new int[n];
        System.out.println("Enter the elements of an array");
        for(int i=0;i<b.length;i++)
        {
            b[i]=sc.nextInt();
        }
        int[] c=new int[n];
        for(int j=0;j<c.length;j++)
        {
            c[j]=b[j];
        }
        System.out.println("The duplicate array is ");
        for(int j=0;j<c.length;j++)
        {
            System.out.print(c[j]+" ");
        }
        if(b==c)
        {
            System.out.println("\nTrue");
        }
        else {
            System.out.println("\nFalse");
        }

        sc.close();
    }
}

