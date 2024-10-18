public class Test {
    public static void main(String[] args) {
       BasicAccount basicAccount = new BasicAccount(500.00) ;
       basicAccount.withdraw(100.00);
        System.out.println("Balance: "+basicAccount.getBalance());
    }
}
