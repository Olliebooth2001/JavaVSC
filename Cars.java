import java.awt.*;
public class Cars {

    int carMiles;
    String Name;
    Color carColour;
    int balance = 20;
    public void Deposit(int money)
    {
        balance += money;
    }
    public int printBalance()
    {
        return balance;
    }

    public Cars(int inputcarmiles, String inputname, Color inputcarcolour, int inputBalance)
    {
        this.carMiles = inputcarmiles;
        this.Name = inputname;
        this.carColour = inputcarcolour;
        this.balance = inputBalance;
    }
    public Cars(){};

    
    
}
