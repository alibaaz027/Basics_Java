package OOPs;

public class BankAccount {

    private int accountNumber;
    private String holderName;
    private double balance;

   public BankAccount(int accountNumber,String holderName){
       this.accountNumber = accountNumber;
       this.holderName = holderName;

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setHolderName(String holderName){
       this.holderName = holderName;
    }

    public String getHolderName(){
       return holderName;
    }


    public void deposit( double amount){
       balance += amount;

    }

    public void withDraw(double amount){
      if(balance>=amount) {
          balance -= amount;
      }else {
          System.out.println("Insufficient Balance");
      }
    }

    public double getBalance(){
        return balance;
    }

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(11234,"Javed");

        System.out.println(myAccount.getHolderName());
        System.out.println(myAccount.getAccountNumber());

        myAccount.deposit(5000);
        System.out.println(myAccount.getBalance());

        myAccount.withDraw(2000);
        System.out.println(myAccount.getBalance());

        myAccount.withDraw(3001);
        //System.out.println(myAccount.getBalance());

    }
}
