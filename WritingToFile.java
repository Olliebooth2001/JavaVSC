import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WritingToFile 
{
    public static void main (String[]args)
    {
        File file = new File("score.txt");
        try{
            PrintWriter writer = new PrintWriter(file);
            writer.println("James Jones");
            writer.println("90");
            writer.println("Ollie Booth");
            writer.println("19");
            writer.println("Jimmy Gilmanez");
            writer.println("19");
            writer.close();

        }
        catch(FileNotFoundException ex)
        {
            System.out.println("Something went wrong ");
        }
        System.out.println("The file has been written successfully");
    }
}
