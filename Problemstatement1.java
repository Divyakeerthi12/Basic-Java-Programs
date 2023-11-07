
//Make an invitation to a birthday party at your place.
// Input your friend's name and print the message :
//"Hey <friendName>, it's my birthday this weekend and you are invited
// to the party at my place. Bring gifts!!! "
//Example -
//Input: Tom
//Output: Hey Tom, it's my birthday this weekend
// and you are invited to the party at my place. Bring gifts!!!
import java.util.*;
public class Problemstatement1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String friendname;
        System.out.println("Enter the name of your friend to whom you want to send the invitation");
        friendname=sc.nextLine();
        System.out.println("Hey "+friendname+" , it's my birthday this weekend\n" +
                "and you are invited to the party at my place. Bring gifts!!!");


    }

}

