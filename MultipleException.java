public class MultipleException {
    public static void main(String args[])
    {
        System.out.println("Hello Everyone");
        int[] b={5,6,7,8};
        //Use pipe symbol for multiple exception
        try{

            int c=b[1]/0;
            System.out.println(c);
            System.out.println(b[9]);
        }catch(ArrayIndexOutOfBoundsException | ArithmeticException ex){
            System.out.println(ex);
        }
        finally{
            System.out.println("The program ends");
        }
    }
}

