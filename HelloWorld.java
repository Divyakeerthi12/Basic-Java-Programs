import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,sum=0,t;
        t=sc.nextInt();
        while(t>0){
            a = sc.nextInt();
            b = sc.nextInt();
            sum=a+b;
            System.out.println(sum);
            t--;
        }
    }
}

