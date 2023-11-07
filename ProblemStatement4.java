//It's time for the highest bid.
// Ask three friends of yours to enter their bid for a Harry Potter antique broomstick and
// find out the highest bid by writing a program to calculate so in just a single line
import java.util.*;
public class ProblemStatement4 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int Geetha,seetha,manu;
        System.out.println("It's time for the highest bid");
        System.out.println("Hii, Geetha,seetha and manu \n Can you please enter your bid" +
                " for a Harry Potter antique broomstick");
        Geetha=sc.nextInt();

        seetha=sc.nextInt();
        manu=sc.nextInt();
        if(Geetha>seetha)
        {
            if(Geetha>manu)
            {
                System.out.println("Highest bid is given by Geetha"+"\nCongrajulations Geetha");
            }
            else {
                System.out.println("Highest bid is given by manu"+"\nCongrajulations manu");
            }

        }
        else {
            if(seetha>manu)
            {
                System.out.println("Highest bid is given by seetha"+"\nCongrajulations seetha");
            }
            else {
                System.out.println("Highest bid is given by manu"+"\nCongrajulations manu");
            }
        }

    }
}

