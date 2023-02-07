/**
 *
 * @author Nsanj
 */
public class Encapsulation {
    private String owner;
    private double balance;

    public Encapsulation(String owner, int startingBal){

        this.owner=owner;
        this.balance=Math.max(startingBal,0);

    }
    public String getOwner()
    {
        return owner;
    }
    public double getBalance()
    {
        return balance;
    }
    public double deposit(double amt)
    {
        if(amt>0)
        {
            this.balance=this.balance+amt;
            return amt;
        }
        return 0;
    }

    public double withdraw(double amt)
    {
        if(amt<=this.balance)
        {
            this.balance=this.balance-amt;
            return amt;
        }
        return 0;
    }    
public static void main(String args[])
{
    Encapsulation en=new Encapsulation("Sanju",1000 );
    en.withdraw(100);
    en.deposit(20000);
    System.out.println(en.getOwner());
    System.out.print(en.getBalance());

}

}

