import java.io.FileWriter;
import java.io.IOException;
public class WriteFile
{
    public static void main(String[] args)
    {
        try
        {
           FileWriter file=new FileWriter("Teachers.txt");
           file.write("I am going to chennai");
           file.write("I am going to Bengaluru");
           file.write("I am going to Kovai");
           file.close();
           System.out.println("Some informations are written in the file");
        }
        catch(IOException e)
        {
            System.out.println("Error.....");
            e.printStackTrace();
        }
    }
}
