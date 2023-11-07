public class ProblemStatement10 {
    public static void main(String args[])
    {
        // write your in IntelliJ IDEA
        Cake ck=new Cake();
        ck.cakeName="Black Forest";
        ck.price=500;
        ck.flavour="Cherry pit flavor";
        ck.isAvailable=true;
        System.out.println("My cake :"+ck.cakeName+"\n"+ck.price+"\n"+ck.flavour+"\n" +ck.isAvailable);

    }
}
class Cake
{
    String cakeName;
    float price;
    String flavour;
    boolean isAvailable;
}



