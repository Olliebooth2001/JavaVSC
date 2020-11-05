import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[]args)
    {
        File file = new File("score.txt");

        try{
            Scanner read = new Scanner(file);
            System.out.println("Reading from the score.txt..");
            while(read.hasNextLine())
            {
                String name = read.nextLine();
                int score = Integer.parseInt(read.nextLine());

                System.out.println();

                System.out.println("Name:  " + name);
                System.out.println("Score:  " + score);

            }
            read.close();
        }
        catch(IOException iox)
        {
            System.out.println("Something went wrong");
        }
    }
}
