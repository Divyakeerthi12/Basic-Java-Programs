//Now it's time to write a digital watch program
// using Java which runs to display the current date and time.
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProblemStatement3 {
    public static void main(String args[])
    {
        SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));

    }
}

