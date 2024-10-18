public class BasicAccount extends BankAccount{
    public BasicAccount(double initialBalance){
        super(initialBalance);
    }
public void withdraw(double amount){
        if (amount>0 && amount<=balance){
           balance-=amount;
            System.out.println("Successful trial");
        }
        else{
            System.out.println("Unsuccessful trial");
        }
}

}
