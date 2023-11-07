public class ifelse {
    public static void main(String args[])
    {
        boolean x=false;
        if(x)
        {
            System.out.println("Value of x is "+x);
        }
        else {
            System.out.println("Value of x is "+x);
        }
        //Try to optimize the code
        boolean y= true;
        String msg;
        if(y)

            msg="Value of y is ";

        else
            msg="Value of y is ";

        System.out.println(msg+y);


    }
}

