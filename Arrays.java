public class Arrays {
    public static void main(String args[])
    {
        //integer array
        int[] a={2,5,6,7};
        //character array
        char[] b={'d','i','v','y','a'};
        //float array
        float[] c={1.2f,5.6f};
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for(int i=0;i<b.length;i++)
        {
            System.out.print(b[i]+" ");
        }
        System.out.println();
        for(int i=0;i<c.length;i++)
        {
            System.out.print(c[i]+" ");
        }
        System.out.println();
        //replace the index value of integers
        a[2]=67;
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        //Another way of intializing the array
        int[] v= new int[10];
        v[0]=1;
        v[1]=8;
        v[2]=5;
        v[3]=100;
        v[4]=109;
        v[5]=900;
        v[6]=800;
        v[7]=98;
        v[8]=67;
        v[9]=7;
        System.out.println(v[9]+" "+v[3]);

    }
}

