import java.util.Scanner;

public class AgeClass {

    static int age;
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");


        try
        {
            AgeClass.SetAge(input.nextInt());
            System.out.println("You are " + age + "years old!");
        }
        catch(CustomException ce)
        {
            System.out.println("you cannot have a negative number boi");
        }
        finally
        {
            input.close();
        }

    }
    public static void SetAge(int age)
    {
        if(age<0)
        {
            throw new CustomException("your age cannot be less than zero");
        }
        else
        {
            AgeClass.age = age;
        }

    }
    
}
