
import java.util.InputMismatchException;
import java.util.Scanner; // Import the Scanner class to read text files

public class Hello{

    
    
    public static void main(String[] args) 
    {
        int name = 1;

        Scanner input = new Scanner(System.in);
        Cars car = new Cars();
        System.out.println(car.printBalance());
        name = input.nextInt();
        car.Deposit(name);
        System.out.println(car.printBalance());

       try{
        System.out.println("Enter a number");
        name = input.nextInt();

       }
       catch(InputMismatchException me)
       {
        System.out.println("what you playing at!");
       }
       input.close();
        


       
      

    }


}

