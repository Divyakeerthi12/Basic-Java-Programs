//Make sure that while performing division the denominator is not zero.
// And if any user inputs zero, appropriate message should be displayed
// instead of a break in execution.
// First ask the user to input the two operands and then output the results
// of all the functions separately.
//Example -
//Input: a = 23, b = 12
//Output: Add = 35
//Sub = 11
//Mul = 264
//Div = 1
//
//Example -
//Input: a = 23, b = 0
//Output: Add = 23
//Sub = 23
//Mul = 0
//Div = Divide by 0 is not allowed
import java.util.*;
public class ProblemStatement9 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int choice;
        System.out.println("Enter the choice");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1: System.out.println("ADD= "+(a+b));
                break;
            case 2: System.out.println("SUB="+(a-b));
                break;
            case 3: System.out.println("MUL"+(a*b));
                break;
            case 4: if(b==0)
            {
                System.out.println("Divide by zero is not allowed");
            }

                System.out.println("DIV= "+((float)a/(float)b));
                break;
            default:System.out.println("Invalid case");

        }
        sc.close();
    }
}

