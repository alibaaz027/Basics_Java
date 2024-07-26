package OOPs.Encapculation;

//A Account class which is a fully encapsulated class.
//It has a private data member and getter and setter methods.
public class Account {

    private long acc_no;
    private String name,email;
    private float amount;

    public void setAcc_no(long acc_no){
        this.acc_no=acc_no;
    }
    public long getAcc_no(){
        return acc_no;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return email;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public static void main(String[] args) {
        Account ac = new Account();
        ac.setAcc_no(11234123);
        ac.setName("Ali");
        ac.setEmail("ali@gmail.com");
        ac.setAmount(35000f);
        System.out.println("Account Number = "+ac.getAcc_no()+" ,Name = "+ac.getName()+
                " ,Email = "+ac.getEmail()+" ,Amount = "+ac.getAmount());
    }
}
