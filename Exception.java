public class Exception {
    public static void main(String args[])
    {
        System.out.println("Hello Everyone");
        int[] a={1,2,3,4};
        //using try catch block for single exception
        try{
            System.out.println(a[7]);


        }catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("Inspite of exception finally block will be executed");
        }
    }
}
