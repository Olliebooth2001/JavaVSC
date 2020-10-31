
import java.util.Collection;
import java.util.InputMismatchException;
import java.util.Scanner; // Import the Scanner class to read text files

public class Hello{

    
    
    public static void main(String[] args) 
    {
        int name = 1;

        Scanner input = new Scanner(System.in);

       try{
        System.out.println("Enter a number");
        name = input.nextInt();

       }
       catch(InputMismatchException me)
       {
        System.out.println("what you playing at!");
       }
        


       
      

    }


}

