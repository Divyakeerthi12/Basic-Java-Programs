import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
public class FileHandling {
    public static void main(String args[])
    {

        String s = "My name is Divyakeerthi";
        //Creating a File and writing the data into the file
        try{
            FileOutputStream fi = new FileOutputStream("test.txt");
            byte[] b=s.getBytes();
            fi.write(b);
            fi.close();
        }catch(IOException ex)
        {
            System.out.println(ex);

        }
        //Reading the file
        try {
            FileInputStream fs = new FileInputStream("test.txt");
            int i = 0;
            //read returns integer values
            //-1 indicates the end of the file
            while ((i = fs.read()) != -1) {
                System.out.print((char)i);
            }
        }catch(IOException e)
        {
            System.out.println(e);
        }

    }
}

