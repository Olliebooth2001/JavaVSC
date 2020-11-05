import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class OldInput {
    

    public static void main(String[]args){
         InputStreamReader input = new InputStreamReader(System.in);
         BufferedReader reader = new BufferedReader(input);

        try{
            System.out.println("Enter a string please");
            String string = reader.readLine();
            System.out.println("You have entered " + string);
        }
        catch(IOException ioe)
        {
            System.out.println("Something went wrong");
        }


    }
}
