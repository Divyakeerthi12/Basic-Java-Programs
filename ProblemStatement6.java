//Write a program to accept an array of integers from the user.
// After accepting the input, arrange the elements in such a way that the largest element
// is at the last index and the smallest is at the 0th index.
// The first line of input will denote the number of elements in the array
// followed by the elements. Finally, output the re-arranged array in ascending order.
//Example -
//Input: 5
//64 1 32 978 12
//Output: 1 12 32 64 978
import java.util.*;
public class ProblemStatement6 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in an array");
        int n=sc.nextInt();
        System.out.println("Enter the elements of an array");
        int[] a=new int[n];
        for(int j=0;j<n;j++)
        {
            a[j]=sc.nextInt();
        }
        System.out.println("The elements are");
        //for(int j=0;j<a.length;j++)
        //{
        //  System.out.print(a[j]+" ");
        //}

        for(int x=0;x<a.length;x++)
        {

            for(int y=x+1;y<a.length;y++)
            {
                int temp=0;
                if(a[x]>a[y])
                {
                    temp=a[x];
                    a[x]=a[y];
                    a[y]=temp;

                }

            }
        }


        System.out.println("\nThe final list of elements in a array arranged in ascending order");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        sc.close();
    }

}

