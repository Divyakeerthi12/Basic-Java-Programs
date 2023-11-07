import java.util.*;
public class TakingUserInput {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("What is your name?");

        //Takes set of words
        String name =sc.nextLine();
        System.out.println("My name is "+name);

        System.out.println("Which city do you stay?");
        //Takes only one word
        String city = sc.next();
        System.out.println("I stay in "+city);

        //Taking integer value
        System.out.println("Enter an integer value");
        int a=sc.nextInt();
        System.out.println(a);
        //Taking input as a float value
        System.out.println("Enter a floating value");
        float b = sc.nextFloat();
        System.out.println(b);





        sc.close();

    }
}

