public class IncrementDecrementoperator {
    public static void main(String args[])
    {
        int age =10;
        //post increment
        int y=age++;
        System.out.println(y);//first assign and then increment
        System.out.println(age);//age=age+1;
        //pre increment
        int z= ++age;
        System.out.println(z);//First increment and then assign
        System.out.println(age);
        //Simple operation
        System.out.println(++age + age++ - ++age);
    }
}
